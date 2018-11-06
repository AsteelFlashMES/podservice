package com.asteelflash.entity;

import com.asteelflash.dto.PackageInfoDto;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hunter.fei on 2018/8/31.
 */
@Entity
@Table(name = "PackageInfoEntity")
public class PackageInfoEntity extends BaseEntity {

  private String lineNo;
  private String station;
  private String packingTime;
  private String isPrint;
  private String status;

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

  public String getIsPrint() {
    return isPrint;
  }

  public void setIsPrint(String isPrint) {
    this.isPrint = isPrint;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PackageInfoEntity() {
  }

  public PackageInfoEntity(PackageInfoDto packageInfoDto) {
    this.lineNo = packageInfoDto.getLineNo();
    this.station = packageInfoDto.getStation();
    this.packingTime = packageInfoDto.getPackingTime();
  }
}
