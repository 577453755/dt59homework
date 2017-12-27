/**
 * Project Name:dt59homework
 * File Name:homework4.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午3:13:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description: 10.4. 编写一个类，定义三个以上属性，并定义三个构造方法；再编写一个类，定义main方法，用三种方式构造前一个类的实例对象； <br/>
 * Date: 2017年12月27日 下午3:13:37 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Homework4 {
    int i;

    char c;

    String s;

    public Homework4(int i) {
        this.i = i;
    }

    public Homework4(int i, char c) {
        i = 4;
        c = '在';
        this.i = i;
        this.c = c;
    }

    public Homework4(int i, char c, String s) {
        this.i = i;
        this.c = c;
        this.s = s;
    }

}
