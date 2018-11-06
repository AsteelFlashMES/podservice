package com.asteelflash.dto;

/**
 * Created by hunter.fei on 2018/8/31.
 */
public class PackageInfoDto {

  private String lineNo;
  private String station;
  private String packingTime;

  public String getLineNo() {
    return lineNo;
  }

  public void setLineNo(String lineNo) {
    this.lineNo = lineNo;
  }

  public String getStation() {
    return station;
  }

  public void setStation(String station) {
    this.station = station;
  }

  public String getPackingTime() {
    return packingTime;
  }

  public void setPackingTime(String packingTime) {
    this.packingTime = packingTime;
  }
}
