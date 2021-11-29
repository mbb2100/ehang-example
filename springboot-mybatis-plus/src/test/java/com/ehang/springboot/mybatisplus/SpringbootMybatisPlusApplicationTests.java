package com.ehang.springboot.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    UserInfoService userInfoService;

    @Test
    void contextLoads() {
        UserInfo id = userInfoService.query().eq("id", 1).one();
        System.out.println(id);
    }

}
