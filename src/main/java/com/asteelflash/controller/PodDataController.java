package com.asteelflash.controller;

import com.asteelflash.dto.MaterialCodeResultDto;
import com.asteelflash.dto.MaterialDataDto;
import com.asteelflash.dto.PackageInfoDto;
import com.asteelflash.dto.PodPostDto;
import com.asteelflash.dto.ResponseDto;
import com.asteelflash.service.PodDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hunter.fei on 2018/5/17.
 */
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/api/pod")
@Api(value = "pod data interface", consumes = "application/json")
public class PodDataController {

  @Autowired
  private PodDataService podDataService;


  @ApiOperation(value = "增加物料信息", response = ResponseDto.class)
  @RequestMapping(value = "/receiveData", method = RequestMethod.POST)
  public ResponseDto savePodData(@RequestBody PodPostDto podPostDto) {
    return podDataService.savePodData(podPostDto);
  }

  @ApiOperation(value = "添加包装物料信息", response = ResponseDto.class)
  @RequestMapping(value = "/addPackageInfo", method = RequestMethod.POST)
  public ResponseDto addPackageInfo(@RequestBody PackageInfoDto packageInfoDto) {
    return podDataService.addPackageInfo(packageInfoDto);
  }

  @ApiOperation(value = "获取物料信息",response = MaterialDataDto.class)
  @RequestMapping(value = "/materialData", method = RequestMethod.GET)
  public MaterialDataDto findMaterialData(@RequestParam(value = "lineNo") int lineNo,
      @RequestParam(value = "beginTime") long beginTime,
      @RequestParam(value = "endTime") long endTime) {
    return podDataService.findMaterialData(lineNo, beginTime, endTime);
  }

  @ApiOperation(value = "物料编码的增加删除", response = ResponseDto.class)
  @RequestMapping(value = "/operateMaterialCode", method = RequestMethod.GET)
  public ResponseDto operateMaterialCode(@RequestParam(value = "opType") int opType,
      @RequestParam(value = "materialKind") int materialKind,
      @RequestParam(value = "data") String data) {
    return podDataService.operateMaterialCode(opType, materialKind, data);
  }

  @ApiOperation(value = "物料编码的查询", response = MaterialCodeResultDto.class)
  @RequestMapping(value = "/materialCode", method = RequestMethod.GET)
  public MaterialCodeResultDto getMaterialCode(@RequestParam(value = "materialKind") int materialKind) {
    return podDataService.getMaterialCode(materialKind);
  }

  @ApiOperation(value = "获取服务器时间", response = ResponseDto.class)
  @RequestMapping(value = "/getServerTime", method = RequestMethod.GET)
  public ResponseDto getServerTime(@RequestParam(value = "lineNo") int lineNo) {
    return podDataService.getServerTime(lineNo);
  }

}
