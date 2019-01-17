package com.wxl.userconsumer8001.configuration;

import feign.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign客户端配置
 * 
 */
@Configuration
public class FeignConfig {
  @Bean
  public Request.Options feignOptions() {
    return new Request.Options(4 * 5000,  2 * 5000);
  }
}
