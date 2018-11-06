package com.asteelflash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hunter.fei on 2018/5/17.
 */

@SuppressWarnings({"serial", "unused"})
@Entity
@Table(name = "MaterialCodeEntity")
public class MaterialCodeEntity extends  BaseEntity{
  //物料种类
  @Column(name = "materialKind")
  private int materialKind;
  //物料编码
  @Column(name = "materialCode")
  private String materialCode;
  //创建时间
  @Column(name = "createTime")
  private long createTime;

  public int getMaterialKind() {
    return materialKind;
  }

  public void setMaterialKind(int materialKind) {
    this.materialKind = materialKind;
  }

  public String getMaterialCode() {
    return materialCode;
  }

  public void setMaterialCode(String materialCode) {
    this.materialCode = materialCode;
  }

  public long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
  }
}
