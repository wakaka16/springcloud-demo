package com.wxl.userservice7001.service.internal;


import com.wxl.userservice7001.entity.UserEntity;
import com.wxl.userservice7001.repository.UserRepository;
import com.wxl.userservice7001.service.UserService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxiaolong
 * @date 2019/1/16 10:38
 */
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public UserEntity getById(String id) {
    Validate.notBlank(id,"用户ID不能为空");
    return userRepository.findOne(id);
  }
}
