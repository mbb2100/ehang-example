package com.ehang.springboot.mybatisplus;

/**
 * @author LENOVO
 * @title: Main
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/11/1 18:22
 */
public class Main {
    public static void main(String[] args) {
        int n = 200;
        while (n <= 1000) {
            if (n % 6 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
