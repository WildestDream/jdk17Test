package com.tw.test.jdk10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CopyOfTest {

    /**
     * List.copyOf(List list)
     * 根据 list 创建一个只读的集合，当 list本身就是只读集合的时候，返回list
     */
    @Test
    void test1() {
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> list2 = List.copyOf(list);
        assertSame(list, list2);
    }

    /**
     * List.copyOf(List list)
     * 根据 list 创建一个只读的集合，当 list不是只读集合的时候，返回新的只读list
     */
    @Test
    void test2() {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = List.copyOf(list);
        assertNotSame(list, list2);
    }
}
