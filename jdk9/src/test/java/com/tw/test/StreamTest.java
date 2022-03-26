package com.tw.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    //takeWhile: 返回满足条件的元素，遇到第一个不满足条件的元素停止!
    @Test
    void testTakeWhile() {
        List<Integer> list = Arrays.asList(1, 4, 3, 5, 61, 2, 3);
        list.stream().takeWhile(x -> x < 5).forEach(System.out::println);
    }
}
