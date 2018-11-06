package com.asteelflash.dto;

import java.util.List;

/**
 * Created by hunter.fei on 2018/5/17.
 */
public class MaterialCodeResultDto {

  private int result;

  private int materialKind;

  private List<MaterialCodeDto> data;

  private String resultMsg;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getMaterialKind() {
    return materialKind;
  }

  public void setMaterialKind(int materialKind) {
    this.materialKind = materialKind;
  }

  public List<MaterialCodeDto> getData() {
    return data;
  }

  public void setData(List<MaterialCodeDto> data) {
    this.data = data;
  }

  public String getResultMsg() {
    return resultMsg;
  }

  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }
}
