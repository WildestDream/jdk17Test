package com.tw.test.jdk16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamToList {
    @Test
    void test() {
        //Stream toList 返回只读集合
        List<Integer> list = Stream.of(1, 2, 4).map(x -> x * 2).toList();
        Assertions.assertEquals(List.of(2, 4, 8), list);

        //list.add(1); //java.lang.UnsupportedOperationException
    }
}
