package com.tw.test.jdk11;

import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    public void contextLoads() {
        String str = getStr();
        boolean blank = str.isBlank();  //判断字符串是空白
        boolean isempty = str.isEmpty();  //判断字符串是否为空
        String result1 = str.strip();    //去除首位空白
        String result2 = str.stripTrailing();  //去除尾部空白
        String result3 = str.stripLeading();  //去除首部空白
        String copyStr = str.repeat(2);  //复制几遍字符串
        long lineCount = str.lines().count();  //行数统计

        System.out.println(blank);
        System.out.println(isempty);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(copyStr);
        System.out.println(lineCount);
    }

    private String getStr() {
        return " ABC ";
    }
}
