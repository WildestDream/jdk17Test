package com.tw.test.jdk16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfTest {
    @Test
    void test() {
        Object str = "hello";
        if (str instanceof String s) {
            //省略了 String s = (String)str;
            int length = s.length();
            Assertions.assertEquals(5, length);
        }
    }
}
