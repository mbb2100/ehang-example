package com.ehang.springboot.lombok.beans;

import lombok.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;


@Getter
public class User {
    private Long id;

    @NonNull
    private String name;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private Integer age;

    private String addr;

    @SneakyThrows(UnsupportedEncodingException.class)
    public void test() {
        io();
    }

    @SneakyThrows
    public void io() {
        throw new Throwable();
    }
}
