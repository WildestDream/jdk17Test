package com.tw.test.jdk12;

import org.junit.jupiter.api.Test;

public class StringTransferTest {
    @Test
    void test() {
        String str = "123";
        String result = str.transform(x -> x + " ab c")
                .transform(String::toUpperCase)
                .transform(String::trim);
        System.out.println("res = " + result);
    }
}
