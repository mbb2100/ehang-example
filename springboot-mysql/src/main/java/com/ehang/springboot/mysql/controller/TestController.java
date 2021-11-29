package com.ehang.springboot.mysql.controller;

import com.alibaba.fastjson.JSON;
import com.ehang.springboot.mysql.generator.user.domain.UserInfo;
import com.ehang.springboot.mysql.generator.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LENOVO
 * @title: TestController
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/10/28 17:03
 */
@RestController
@RequestMapping("/a")
public class TestController {

    @GetMapping("/b")
    public Map<Long, String> b() {
        Map<Long, String> mp = new HashMap<>();
        mp.put(1L,"123");
        mp.put(123456789L,"456");
        mp.put(123456789000L,"789");
        return mp;
    }

    @Resource
    UserInfoMapper userInfoMapper;

    @Autowired
    TestObj testObj;

    @GetMapping("/t1")
    public String t1() {
        UserInfo userInfo = userInfoMapper.selectById(1);
        return "123";
    }

    @GetMapping("/t2")
    public String t2(@RequestParam List<String> vas) {
        System.out.println(JSON.toJSONString(vas));

        System.out.println("1111");
        testObj.t();
        System.out.println("2222");
        return "456";
    }

}
