package com.wxl.orderservice6002.service.internal;

import com.wxl.orderservice6002.entity.OrderEntity;
import com.wxl.orderservice6002.repository.OrderRepository;
import com.wxl.orderservice6002.service.OrderService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:38
 */
@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  private OrderRepository orderRepository;

  @Override
  public OrderEntity getById(String id) {
    Validate.notBlank(id,"商品ID不能为空");
    return orderRepository.findOne(id);
  }
}
