package com.tw.test.private_interface_method;

public interface Service {
    //接口中可以定义静态方法
    static void staticMethod() {
        System.out.println("i'm static method");
    }

    //定义default 方法（注意，也是 public 的）
    default void defaultMethod() {
        System.out.println("I'm default method");
        privateMethod();
    }

    //jdk 1.9 新特性，接口中定义私有方法
    private void privateMethod() {
        System.out.println("I'm private method");
    }
}
