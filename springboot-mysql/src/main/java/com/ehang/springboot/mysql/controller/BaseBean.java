package com.ehang.springboot.mysql.controller;

import lombok.Data;

/**
 * @author LENOVO
 * @title: BaseBean
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/7 18:50
 */
@Data
public class BaseBean<T> {
    private Integer code;

    private String msg;

    private T data;
}
