package com.asteelflash.dto;

import java.util.List;

/**
 * Created by hunter.fei on 2018/5/18.
 */
public class PodPostDto {
  private List<PodDataDto> materialData;

  public List<PodDataDto> getMaterialData() {
    return materialData;
  }

  public void setMaterialData(List<PodDataDto> materialData) {
    this.materialData = materialData;
  }
}
