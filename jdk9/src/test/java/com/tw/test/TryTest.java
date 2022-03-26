package com.tw.test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TryTest {
    public static void main(String[] args) {
        //try中的资源的实例化可以放在try的外侧
        //但是reader, writer 不能修改
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try (reader; writer) {
            int read = reader.read(new char[100]);
            writer.write(100);
            //reader = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
