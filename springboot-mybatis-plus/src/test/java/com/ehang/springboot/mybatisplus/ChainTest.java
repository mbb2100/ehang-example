package com.ehang.springboot.mybatisplus;

import com.alibaba.fastjson.JSON;
import com.ehang.springboot.mybatisplus.generator.user.demain.UserInfo;
import com.ehang.springboot.mybatisplus.generator.user.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author LENOVO
 * @title: ChainTest
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/28 16:08
 */
@SpringBootTest
@Slf4j
public class ChainTest {
    @Autowired
    UserInfoService userInfoService;

    @Test
    void chainQuery() {
        List<UserInfo> userInfos = userInfoService
                .query()
                .eq("user_name", "一行Java 1")
                .list();
        log.info("流式查询：{}", JSON.toJSONString(userInfos));
    }

    @Test
    void chainLambdaQuery() {
        List<UserInfo> userInfos = userInfoService
                .lambdaQuery()
                .eq(UserInfo::getUserName, "一行Java 1")
                .list();
        log.info("流式查询：{}", JSON.toJSONString(userInfos));
    }
}
