package com.test;

import com.example.domain.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        //因为PersonService所处的包没有暴露出来，则无法引入
        //PersonService personService = new PersonService();
    }
}
