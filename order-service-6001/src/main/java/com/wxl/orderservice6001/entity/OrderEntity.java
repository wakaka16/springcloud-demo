package com.wxl.orderservice6001.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:16
 */
@Entity
@Table(name = "t_order")
public class OrderEntity extends UuidEntity{

  @Column(name = "name")
  private String name;
  @Column(name = "create_time")
  private Date createTime;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
