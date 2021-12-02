package com.ehang.springboot.mybatisplus.generator.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ehang.springboot.mybatisplus.generator.user.demain.UserInfo;
import com.ehang.springboot.mybatisplus.generator.user.mapper.UserInfoMapper;
import com.ehang.springboot.mybatisplus.generator.user.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{
}




