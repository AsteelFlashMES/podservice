package com.asteelflash.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

/**
 * Created by hekeji on 16/10/16.
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseEntity implements Serializable {
  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

}
