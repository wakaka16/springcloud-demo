package com.wxl.provideruserhystrix5001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderUserHystrix5001Application {

  public static void main(String[] args) {
    SpringApplication.run(ProviderUserHystrix5001Application.class, args);
  }

}

