package com.tw.test;

import java.util.Comparator;

public class DiamondOperatorTest {
    public static void main(String[] args) {
        //Comparator<> （匿名内部类）中的泛型可以省略
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
    }
}
