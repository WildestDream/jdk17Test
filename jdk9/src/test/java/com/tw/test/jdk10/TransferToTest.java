package com.tw.test.jdk10;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TransferToTest {

    @Test
    void test() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\workspace\\jdk17Test\\data")));
             PrintWriter writer = new PrintWriter(new FileOutputStream("D:\\workspace\\jdk17Test\\data2"))) {
            long count = reader.transferTo(writer);
            System.out.println("Transfer " + count + " chars totally");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
