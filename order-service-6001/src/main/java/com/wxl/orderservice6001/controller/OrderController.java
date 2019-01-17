package com.wxl.orderservice6001.controller;

import com.wxl.orderservice6001.entity.OrderEntity;
import com.wxl.orderservice6001.service.OrderService;
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
public class OrderController {
  @Autowired
  private OrderService orderService;

  @RequestMapping(value = "users/{id}")
  public OrderEntity getById(@PathVariable(value = "id") String id){
    return orderService.getById(id);
  }

}
