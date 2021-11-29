package com.ehang.springboot.mysql.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author LENOVO
 * @title: TestObj
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/2 18:36
 */
@Component
public class TestObj {

    @Async
    public void t() {
        try {
            Thread.sleep(10000);
            System.out.println("33333");
        } catch (Exception ex) {

        }

    }
}
