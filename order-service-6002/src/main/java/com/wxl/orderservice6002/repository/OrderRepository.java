package com.wxl.orderservice6002.repository;

import com.wxl.orderservice6002.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:36
 */
@Repository
public interface OrderRepository extends
    JpaRepository<OrderEntity, String>,
    JpaSpecificationExecutor<OrderEntity> {

}
