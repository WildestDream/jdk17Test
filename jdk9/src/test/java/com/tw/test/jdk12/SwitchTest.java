package com.tw.test.jdk12;

import org.junit.jupiter.api.Test;

public class SwitchTest {

    /**
     * JDK12 对switch-case的优化：
     * 1. 不需要写 break;
     * 2. case 多个条件
     * 3. switch表达式
     */
    @Test
    void testSwitch() {
        TYPE type = getType();
        String result = switch (type) {
            case TYPE1 -> "1";
            case TYPE2, TYPE3 -> "2";
            default -> throw new IllegalArgumentException();
        };
        System.out.println("result = " + result);
    }

    private TYPE getType() {
        return TYPE.TYPE1;
    }

    enum TYPE {
        TYPE1,
        TYPE2,
        TYPE3,
        TYPE4
    }
}
