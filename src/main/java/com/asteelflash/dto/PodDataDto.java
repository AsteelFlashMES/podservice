package com.asteelflash.dto;

/**
 * Created by hunter.fei on 2018/5/17.
 */
public class PodDataDto {
  //设备序号
  private int lineNo;
  //物料代号
  private int materialKind;
  //物料ID
  private String mateID;
  //供应商
  private String vendor;
  //料号
  private String partNumber;
  //模号
  private String moldNo;
  //制造商料号
  private String mpn;
  //生产日期
  private String dateCode;
  //数量
  private int quantity;
  //镭射码
  private String laserCode;
  //创建时间，主机时间的毫秒数
  private long createTime;

  public int getLineNo() {
    return lineNo;
  }

  public void setLineNo(int lineNo) {
    this.lineNo = lineNo;
  }

  public int getMaterialKind() {
    return materialKind;
  }

  public void setMaterialKind(int materialKind) {
    this.materialKind = materialKind;
  }

  public String getMateID() {
    return mateID;
  }

  public void setMateID(String mateID) {
    this.mateID = mateID;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public String getMoldNo() {
    return moldNo;
  }

  public void setMoldNo(String moldNo) {
    this.moldNo = moldNo;
  }

  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public String getDateCode() {
    return dateCode;
  }

  public void setDateCode(String dateCode) {
    this.dateCode = dateCode;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getLaserCode() {
    return laserCode;
  }

  public void setLaserCode(String laserCode) {
    this.laserCode = laserCode;
  }

  public long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
  }
}
