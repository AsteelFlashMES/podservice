package com.asteelflash.dto;

import java.util.List;

/**
 * Created by hunter.fei on 2018/5/17.
 */
public class MaterialDataDto {

  private int result;

  private List<PodDataDto> materialData;

  private String resultMag;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public List<PodDataDto> getMaterialData() {
    return materialData;
  }

  public void setMaterialData(List<PodDataDto> materialData) {
    this.materialData = materialData;
  }

  public String getResultMag() {
    return resultMag;
  }

  public void setResultMag(String resultMag) {
    this.resultMag = resultMag;
  }
}
