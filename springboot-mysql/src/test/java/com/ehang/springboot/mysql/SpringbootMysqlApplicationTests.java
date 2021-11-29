package com.ehang.springboot.mysql;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ehang.springboot.mysql.controller.BaseBean;
import com.ehang.springboot.mysql.controller.User;
import com.ehang.springboot.mysql.generator.user.domain.UserInfo;
import com.ehang.springboot.mysql.generator.user.mapper.UserInfoMapper;
import com.ehang.springboot.mysql.generator.user.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@SpringBootTest
@Slf4j
class SpringbootMysqlApplicationTests {

    @Autowired
    UserInfoService userInfoService;

    @Resource
    UserInfoMapper userInfoMapper;

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void restTemplate() throws Exception {
        ParameterizedTypeReference<Map<Long, String>> typeRef = new ParameterizedTypeReference<Map<Long, String>>() {};
        Map<Long, String> mp = restTemplate.exchange("http://127.0.0.1:8080/a/b", HttpMethod.GET, new HttpEntity<>(null), typeRef).getBody();

        log.info("mp:{}", mp);
        log.info("获取key为:{} 的值：{}",1L,mp.get(1L));
        log.info("获取key为:{} 的值：{}",123456789L,mp.get(123456789L));
        log.info("获取key为:{} 的值：{}",123456789000L,mp.get(123456789000L));

        //BaseBean<Goods> user = new BaseBean<>();
    }

    @Test
    void contextLoads() {
        List<UserInfo> userInfos = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(i);
            userInfo.setUserName("名字:" + i);
            userInfo.setAge(random.nextInt(100));
            userInfo.setSource((byte) random.nextInt(3));
            userInfos.add(userInfo);
        }
        UserInfo userInfo = userInfoMapper.selectById(1);

//        userInfoService.saveBatch(userInfos);
//        userInfoMapper.

        List<UserInfo> id = userInfoService.query().notIn("id", new int[]{1, 2, 3}).list();
        //userInfoService.getMap(Q)
        //QueryChainWrapper<UserInfo> id = userInfoService.query().eq("id", 1).select("name","age");
    }

}
