package com.asteelflash.service;

import com.asteelflash.dto.MaterialCodeDto;
import com.asteelflash.dto.MaterialCodeResultDto;
import com.asteelflash.dto.MaterialDataDto;
import com.asteelflash.dto.PackageInfoDto;
import com.asteelflash.dto.PodDataDto;
import com.asteelflash.dto.PodPostDto;
import com.asteelflash.dto.ResponseDto;
import com.asteelflash.entity.MaterialCodeEntity;
import com.asteelflash.entity.MaterialDataEntity;
import com.asteelflash.entity.PackageInfoEntity;
import com.asteelflash.repository.MaterialCodeRepository;
import com.asteelflash.repository.MaterialDataRepository;
import com.asteelflash.repository.PackageInfoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hunter.fei on 2018/5/17.
 */
@Service
public class PodDataService {

  @Autowired
  private MaterialCodeRepository materialCodeRepository;

  @Autowired
  private MaterialDataRepository materialDataRepository;
  @Autowired
  private PackageInfoRepository packageInfoRepository;


  public ResponseDto savePodData(PodPostDto podPostDto) {
    ResponseDto responseDto = new ResponseDto();
    try {
      if (null != podPostDto && null != podPostDto.getMaterialData()
          && podPostDto.getMaterialData().size() > 0) {
        for (PodDataDto podDataDto : podPostDto.getMaterialData()) {
          MaterialDataEntity materialDataEntity = new MaterialDataEntity(podDataDto);
          materialDataRepository.save(materialDataEntity);
        }
        responseDto.setResult(0);
        responseDto.setResultMsg("success");
      } else {
        responseDto.setResult(1);
        responseDto.setResultMsg("没有接收到任何数据！");
      }
    } catch (Exception e) {
      e.printStackTrace();
      responseDto.setResult(1);
      responseDto.setResultMsg(e.getMessage());
    } finally {
      return responseDto;
    }
  }

  public MaterialDataDto findMaterialData(int lineNo, long beginTime, long endTime) {
    MaterialDataDto materialDataDto = new MaterialDataDto();
    try {
      List<MaterialDataEntity> materialDataEntityList = materialDataRepository
          .findMaterialDataEntitiesByLineNoAndAndCreateTimeBetween(lineNo, beginTime, endTime);
      List<PodDataDto> podDataDtoList = new ArrayList<>();
      materialDataEntityList
          .forEach(materialDataEntity -> podDataDtoList.add(cratePodDataDto(materialDataEntity)));
      materialDataDto.setResult(0);
      materialDataDto.setMaterialData(podDataDtoList);
    } catch (Exception e) {
      e.printStackTrace();
      materialDataDto.setResult(1);
      materialDataDto.setResultMag(e.getMessage());
    } finally {
      return materialDataDto;
    }
  }

  private PodDataDto cratePodDataDto(MaterialDataEntity materialDataEntity) {
    PodDataDto podDataDto = new PodDataDto();
    podDataDto.setCreateTime(materialDataEntity.getCreateTime());
    podDataDto.setDateCode(materialDataEntity.getDateCode());
    podDataDto.setLaserCode(materialDataEntity.getLaserCode());
    podDataDto.setLineNo(materialDataEntity.getLineNo());
    podDataDto.setMateID(materialDataEntity.getMateID());
    podDataDto.setMaterialKind(materialDataEntity.getMaterialKind());
    podDataDto.setMoldNo(materialDataEntity.getMoldNo());
    podDataDto.setMpn(materialDataEntity.getMPN());
    podDataDto.setQuantity(materialDataEntity.getQuantity());
    podDataDto.setPartNumber(materialDataEntity.getPartNumber());
    podDataDto.setVendor(materialDataEntity.getVendor());
    return podDataDto;
  }

  public ResponseDto operateMaterialCode(int opType, int materialKind, String data) {
    ResponseDto responseDto = new ResponseDto();
    try {
      MaterialCodeEntity materialCodeEntity = new MaterialCodeEntity();
      materialCodeEntity.setMaterialKind(materialKind);
      materialCodeEntity.setMaterialCode(data);
      MaterialCodeEntity result = materialCodeRepository.getMaterialCodeEntityByMaterialCode(data);
      if (opType == 0) {
        materialCodeEntity.setCreateTime(System.currentTimeMillis());
        if (null == result) {
          materialCodeRepository.save(materialCodeEntity);
        } else {
          responseDto.setResult(1);
          responseDto.setResultMsg("This material code is existed!");
          return responseDto;
        }
      } else if (opType == 1) {
        materialCodeEntity.setId(result.getId());
        materialCodeRepository.delete(materialCodeEntity);
      }
      responseDto.setResult(0);
      responseDto.setResultMsg("success");
    } catch (Exception e) {
      e.printStackTrace();
      responseDto.setResult(1);
      responseDto.setResultMsg(e.getMessage());
    } finally {
      return responseDto;
    }
  }

  public MaterialCodeResultDto getMaterialCode(int materialKind) {
    MaterialCodeResultDto materialCodeResultDto = new MaterialCodeResultDto();
    try {
      List<MaterialCodeEntity> materialCodeEntities = materialCodeRepository
          .getMaterialCodeEntitiesByMaterialKind(materialKind);
      List<MaterialCodeDto> materialCodeDtos = new ArrayList<>();
      materialCodeEntities.forEach(
          materialCodeEntity -> materialCodeDtos.add(crateMaterialCodeDto(materialCodeEntity)));
      materialCodeResultDto.setResult(0);
      materialCodeResultDto.setMaterialKind(materialKind);
      materialCodeResultDto.setData(materialCodeDtos);
    } catch (Exception e) {
      e.printStackTrace();
      materialCodeResultDto.setResult(1);
      materialCodeResultDto.setResultMsg(e.getMessage());
    } finally {
      return materialCodeResultDto;
    }
  }

  private MaterialCodeDto crateMaterialCodeDto(MaterialCodeEntity materialCodeEntity) {
    MaterialCodeDto materialCodeDto = new MaterialCodeDto();
    materialCodeDto.setCreateTime(materialCodeEntity.getCreateTime());
    materialCodeDto.setMaterialCode(materialCodeEntity.getMaterialCode());
    return materialCodeDto;
  }

  public ResponseDto getServerTime(int lineNo) {
    ResponseDto responseDto = new ResponseDto();
    responseDto.setResult(0);
    responseDto.setServerTime(System.currentTimeMillis());
    return responseDto;
  }

  public ResponseDto addPackageInfo(PackageInfoDto packageInfoDto) {
    ResponseDto responseDto = new ResponseDto();
    try {
      if (null != packageInfoDto) {
        PackageInfoEntity packageInfoEntity = new PackageInfoEntity(packageInfoDto);
        if (null != packageInfoEntity.getLineNo() && !packageInfoEntity.getLineNo().trim()
            .equals("")
            && null != packageInfoEntity.getStation() && !packageInfoEntity.getStation().trim()
            .equals("")) {
          packageInfoRepository.save(packageInfoEntity);
          responseDto.setResult(0);
          responseDto.setResultMsg("success");
        } else {
          responseDto.setResult(1);
          responseDto.setResultMsg("Error data！");
        }
      } else {
        responseDto.setResult(1);
        responseDto.setResultMsg("No data was received！");
      }
    } catch (Exception e) {
      e.printStackTrace();
      responseDto.setResult(1);
      responseDto.setResultMsg(e.getMessage());
    } finally {
      return responseDto;
    }

  }
}
