package com.ehang.java.basics.arraylist_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author LENOVO
 * @title: Main
 * @projectName ehang-example
 * @description: TODO
 * @date 2021/12/1 0:18
 */
public class Main {
    private static final Integer COUNT = 100000;

    public static void main(String[] args) {
        test(new ArrayList<>(COUNT), COUNT);
        test(new LinkedList(), COUNT);
    }

    public static void test(List list, Integer num) {
        long time = System.currentTimeMillis();
        int i = ThreadLocalRandom.current().nextInt(0, num);
        for (int i1 = 0; i1 < num; i1++) {
            list.add(i, i1);
        }
        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }
}
