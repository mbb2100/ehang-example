package com.ehang.springboot.mysql.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author LENOVO
 * @title: Main
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/2 21:56
 */
@Slf4j
public class Main {
    public static void main(String[] args) throws Exception {
        //A服务的数据
        Map<Long, String> mp = new HashMap<>();
        Long l = 123456789L;
        mp.put(l, "123");
        log.info("key：{}", l);

        // B服务通过网络请求得到A服务的响应文本
        String s1 = JSON.toJSONString(mp);
        log.info("json文本：{}", s1);

        // 将文本转换成Map对象
        Map<Long, String> mp2 = JSON.parseObject(s1, Map.class);
        log.info("json文本转换的Map对象：{}", mp2);

        Iterator<Long> iterator = mp2.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getClass().getGenericSuperclass());
        }

        // 通过key取值
        log.info("通过key：{}得到的值：{}", l, mp2.get(l));
    }
}
