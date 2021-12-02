package com.ehang.springboot.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ehang.springboot.mybatisplus.generator.user.demain.UserInfo;
import com.ehang.springboot.mybatisplus.generator.user.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LENOVO
 * @title: CountTest
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/28 16:05
 */
@SpringBootTest
@Slf4j
public class CountTest {
    @Autowired
    UserInfoService userInfoService;

//    // 查询总记录数
//    int count();
//    // 根据 Wrapper 条件，查询总记录数
//    int count(Wrapper<T> queryWrapper);

    @Test
    void count() {
        int count = userInfoService.count();
        log.info("总数：{}", count);
    }

    @Test
    void countByWrapper() {
        int count = userInfoService.count(new QueryWrapper<UserInfo>()
                .lambda()
                .ge(UserInfo::getId, 100));
        log.info("按条件查询总数：{}", count);
    }
}
