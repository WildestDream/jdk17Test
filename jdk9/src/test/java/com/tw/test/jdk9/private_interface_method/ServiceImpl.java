package com.tw.test.jdk9.private_interface_method;

public class ServiceImpl implements Service {
    public static void main(String[] args) {

        //注意：接口中定义的静态方法只能由接口调用
        Service.staticMethod();
        //ServiceImpl.staticMethod();

        Service impl = new ServiceImpl();
        impl.defaultMethod();
    }
}
