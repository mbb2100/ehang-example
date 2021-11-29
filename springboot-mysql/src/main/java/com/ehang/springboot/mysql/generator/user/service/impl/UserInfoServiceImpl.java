package com.ehang.springboot.mysql.generator.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ehang.springboot.mysql.generator.user.domain.UserInfo;
import com.ehang.springboot.mysql.generator.user.service.UserInfoService;
import com.ehang.springboot.mysql.generator.user.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




