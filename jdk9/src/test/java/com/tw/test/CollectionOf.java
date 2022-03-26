package com.tw.test;

import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionOf {
    @Test
    void test1() {
        //jdk1.8创建只读集合
        List<Integer> list = Arrays.asList(1, 2, 3);
    }

    @Test
    void test2() {
        //jdk1.8创建只读集合
        ArrayList<Object> list = new ArrayList<>();
        List<Object> unmodifiableList = Collections.unmodifiableList(list);
    }


    @Test
    void test3() {
        //jdk1.9创建只读集合
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, String> map = Map.of("k1", "v2",
                "k2", "v2");
    }
}
