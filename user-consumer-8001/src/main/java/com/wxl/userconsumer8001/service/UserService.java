package com.wxl.userconsumer8001.service;

import com.wxl.userconsumer8001.service.degradation.UserServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wangxiaolong
 * @date 2019/1/17 11:26
 * url = "http://127.0.0.1:7001" 这个应该配置为springboot非微服务时使用的
 * name = "user-service"目标服务组的名称 spring-application-name，在微服务中多个相同服务使用相同的name
 * 默认轮询方式访问
 * fallbackFactory= UserServiceFallbackFactory.class:服务熔断回调的业务处理
 */
@FeignClient(path = "/v1", name = "user-service-hystrix",fallbackFactory= UserServiceFallbackFactory.class)
public interface UserService {

  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public String getUserById(@PathVariable(value = "id")String id);

}
