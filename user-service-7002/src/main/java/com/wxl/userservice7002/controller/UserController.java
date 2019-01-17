package com.wxl.userservice7002.controller;

import com.wxl.userservice7002.entity.UserEntity;
import com.wxl.userservice7002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:49
 */
@RestController
@RequestMapping(value = "/v1")
public class UserController {
  @Autowired
  private UserService userService;

  @RequestMapping(value = "users/{id}")
  public UserEntity getById(@PathVariable(value = "id") String id){
    return userService.getById(id);
  }

}
