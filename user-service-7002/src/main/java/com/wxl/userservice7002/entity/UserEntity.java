package com.wxl.userservice7002.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:16
 */
@Entity
@Table(name = "t_user")
public class UserEntity extends UuidEntity{

  @Column(name = "name")
  private String name;
  @Column(name = "age")
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
