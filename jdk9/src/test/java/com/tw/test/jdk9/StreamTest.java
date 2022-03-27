package com.tw.test.jdk9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    //takeWhile: 一直保留元素，直到遇到第一个不满足条件的元素停止
    @Test
    void testTakeWhile() {
        List<Integer> list = Arrays.asList(1, 4, 3, 5, 61, 2, 3);
        List<Integer> res = list.stream().takeWhile(x -> x < 5).collect(Collectors.toList());
        Assertions.assertEquals(List.of(1, 4, 3), res);
    }

    //若第一个元素不满足，则全部删除
    @Test
    void testTakeWhileWhenFirstElementNotMatched() {
        List<Integer> list = Arrays.asList(7, 4, 3, 5, 61, 2, 3);
        List<Integer> res = list.stream().takeWhile(x -> x < 5).collect(Collectors.toList());
        Assertions.assertEquals(Collections.emptyList(), res);
    }


    //一直删除元素，直到遇到第一个不满足条件的元素位置，后面的全部保留
    @Test
    void testDropWhile() {
        List<Integer> list = Arrays.asList(6, 7, 1, 2, 3);
        List<Integer> res = list.stream().dropWhile(x -> x > 5).collect(Collectors.toList());
        Assertions.assertEquals(List.of(1, 2, 3), res);
    }

    //若第一个元素不满足，则全部保留
    @Test
    void testDropWhileWhenFirstElementNotMatched() {
        List<Integer> list = Arrays.asList(2, 7, 1, 2, 3);
        List<Integer> res = list.stream().dropWhile(x -> x > 5).collect(Collectors.toList());
        Assertions.assertEquals(List.of(2, 7, 1, 2, 3), res);
    }
}
