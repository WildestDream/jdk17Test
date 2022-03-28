package com.tw.test.jdk14;


/*
反编译后：
 public final class com.tw.test.jdk14.Person extends java.lang.Record {
        public com.tw.test.jdk14.Person(java.lang.Long, java.lang.String, java.lang.Integer);
        public final java.lang.String toString();
        public final int hashCode();
        public final boolean equals(java.lang.Object);
        public java.lang.Long id();
        public java.lang.String name();
        public java.lang.Integer age();
}

    只读, 类与属性都是 final 的
    可以自定义方法，但是无法修改属性
    安全，用于数据传递
 */

public record Person(Long id, @Deprecated String name, Integer age) {

    public static final String TYPE = "RECORD";

    public String print() {
        return "hello world";
    }
}
