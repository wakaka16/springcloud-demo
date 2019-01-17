package com.wxl.provideruserhystrix5001.controller;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wxl.provideruserhystrix5001.entity.UserEntity;
import com.wxl.provideruserhystrix5001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:49
 * 如果有熔断会返回熔断的内容，
 * 如果没有会报500的错误
 */
@RestController
@RequestMapping(value = "/v1")
public class UserController {
  @Autowired
  private UserService userService;

  @RequestMapping(value = "users/{id}")
  @HystrixCommand(fallbackMethod = "processHystrix_Get")
  public UserEntity getById(@PathVariable(value = "id") String id){
//    int i = 1/0;
    return userService.getById(id);
  }

  public UserEntity processHystrix_Get(@PathVariable(value="id") String id) {
    UserEntity user = new UserEntity();
    user.setId(id);
    user.setName("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
    return user;
  }



}
