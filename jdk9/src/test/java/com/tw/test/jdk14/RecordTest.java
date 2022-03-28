package com.tw.test.jdk14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecordTest {
    @Test
    void test() {
        Person person = new Person(1L, "James", 34);
        System.out.println(person.age());
        System.out.println(person.id());
        System.out.println(person.name());

        Assertions.assertEquals("hello world", person.print());
    }
}
