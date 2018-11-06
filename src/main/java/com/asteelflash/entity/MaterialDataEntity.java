package com.asteelflash.entity;

import com.asteelflash.dto.PodDataDto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hunter.fei on 2018/5/17.
 */
@SuppressWarnings({"serial", "unused"})
@Entity
@Table(name = "MaterialDataEntity")
public class MaterialDataEntity extends BaseEntity{

  //设备序号
  @Column(name = "lineNo")
  private int lineNo;
  //物料代号
  @Column(name = "materialKind")
  private int materialKind;
  //物料ID
  @Column(name = "mateID")
  private String mateID;
  //供应商
  @Column(name = "vendor")
  private String vendor;
  //料号
  @Column(name = "partNumber")
  private String partNumber;
  //模号
  @Column(name = "moldNo")
  private String moldNo;
  //制造商料号
  @Column(name = "MPN")
  private String MPN;
  //生产日期
  @Column(name = "dateCode")
  private String dateCode;
  //数量
  @Column(name = "quantity")
  private int quantity;
  //镭射码
  @Column(name = "laserCode")
  private String laserCode;
  //创建时间，主机时间的毫秒数
  @Column(name = "createTime")
  private long createTime;

  public MaterialDataEntity(){
    super();
  }
  public MaterialDataEntity(PodDataDto podDataDto) {
    this.lineNo = podDataDto.getLineNo();

    this.materialKind = podDataDto.getMaterialKind();

    this.mateID = podDataDto.getMateID();

    this.vendor = podDataDto.getVendor();

    this.partNumber = podDataDto.getPartNumber();

    this.moldNo = podDataDto.getMoldNo();

    this.MPN = podDataDto.getMpn();

    this.dateCode = podDataDto.getDateCode();

    this.quantity = podDataDto.getQuantity();

    this.laserCode = podDataDto.getLaserCode();

    this.createTime = podDataDto.getCreateTime();
  }

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

  public String getMPN() {
    return MPN;
  }

  public void setMPN(String MPN) {
    this.MPN = MPN;
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
