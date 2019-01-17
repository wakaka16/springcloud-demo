package com.wxl.userservice7002.repository;

import com.wxl.userservice7002.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:36
 */
@Repository
public interface UserRepository extends
    JpaRepository<UserEntity, String>,
    JpaSpecificationExecutor<UserEntity> {

}
