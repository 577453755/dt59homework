/**
 * Project Name:dt59homework
 * File Name:homework2.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午2:16:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description: 10.2.
 * 编写一个类，定义几个属性，同时给属性赋值；再定义一个无参数构造方法，在构造方法中，首先输出各属性值到控制台，再给属性赋值；观察输出值内容。 <br/>
 * Date: 2017年12月27日 下午2:16:04 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Homework2 {
    int i = 3;// 赋值

    String s = "鲲";// 赋值

    public Homework2() {
        System.out.println(this.i);// 输出
        System.out.println(this.s);

        this.i = 2;// 重新赋值
        this.s = "鵬";

    }

    public static void main(String[] args) {
        Homework2 h = new Homework2();
        System.out.println();
        System.out.println(h.i);
        System.out.println(h.s);

    }
}
