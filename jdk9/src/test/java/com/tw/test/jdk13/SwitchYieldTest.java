package com.tw.test.jdk13;

import org.junit.jupiter.api.Test;


public class SwitchYieldTest {
    @Test
    void test() {
        String input = getType();
        int result = switch (input) {
            case "A":
                yield 1;
            case "B":
                yield 2;
            case "C":
                yield 3;
            default:
                yield 0;
        };
        System.out.println("result = " + result);
    }

    /*
    1. yield可以直接作为switch-case的返回值，用于中断 switch-case（但是并不是中断整个方法，这一点与 return不一样）
    2. case 块中可以定义各自的局部变量
    3. 不用担心 case击穿，不用写 break了。
     */
    @Test
    void test2() {
        String input = getType();
        double result = switch (input) {
            case "A" -> {
                int a = 1;
                int b = 2;
                yield a + b;
            }
            case "B" -> {
                int a = 1;
                int b = 2;
                yield a * b;
            }
            case "C" -> {
                int a = 4;
                int b = 3;
                yield a % b;
            }
            case "D", "E" -> Math.random();
            default -> 0;
        };
        System.out.println("result = " + result);
    }

    private String getType() {
        return "B";
    }
}
