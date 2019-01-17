package com.wxl.userconsumer8001.controller;

import com.wxl.userconsumer8001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaolong
 * @date 2019/1/17 11:25
 * 用户服务的消费者，同时在消费者端完成负载均衡和熔断处理
 */
@RestController
@RequestMapping(value = "v1/consumer/users")
public class UserController {

  @Autowired
  private UserService userService;
  @GetMapping(value = "/{id}")
  public String getUserById(@PathVariable(value = "id")String id){
    return userService.getUserById(id);
  }

}
