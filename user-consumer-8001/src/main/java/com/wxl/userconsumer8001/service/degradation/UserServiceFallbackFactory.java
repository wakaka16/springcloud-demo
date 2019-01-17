package com.wxl.userconsumer8001.service.degradation;

import com.wxl.userconsumer8001.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author wangxiaolong
 * @date 2019/1/17 16:40
 * +客户端+的服务降级
 * 当服务存在就访问服务，当服务失败返回自定义信息
 * 未做服务降级：返回Connection refused: connect executing GET http://user-service-hystrix/v1/users/1
 * 使用服务降级后：该ID：1没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭 no this database in MySQL
 */
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {

  @Override
  public UserService create(Throwable throwable) {
   return new UserService() {
     @Override
     public String getUserById(String id) {
       return "该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,"
           + "此刻服务Provider已经关闭 no this database in MySQL";
     }
   };
  }
}
