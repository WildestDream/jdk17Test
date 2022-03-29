package com.tw.test.jdk10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class VarTest {

    @Test
    void test1() {
        var i = 1;
        System.out.println(i);

        var b = Boolean.TRUE;
        System.out.println(b.getClass());

        var c = this;
    }

    @Test
    void test2() {
        var list = new ArrayList<String>(); //ArrayList<String>不能写成：ArrayList<>
        list.add("1");
        list.add("2");
        list.add("3");

        for (var ele : list) {
            System.out.println(ele);
        }
    }

    /**
     * 不适合var的几种情况
     */
    @Test
    void testCanNotUseVar() {
        //var num;

        //var num = null;

        //var supplier = () -> Math.random();

        //var consumer = System.out::println;

        //var arr = {1,2,3}

/*     try {
            var reader = new InputStreamReader(System.in);
        } catch (var e) {
            e.printStackTrace();
        }
*/
    }

    //不能做返回值类型
/*    public var getMsg(){
        return "1";
    }*/

    //不能做方法的参数
/*    public void method(var params){
    }*/

    //不能做属性, 系统不知道怎么赋初值，无法推断
//    private val id;

}
