/**
 * Project Name:dt59homework
 * File Name:Homework6_1.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午3:53:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:53:55 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Homework6_1 {

    public static void main(String[] args) {

        Homework6 h = new Homework6();
        h.name = "张";
        Homework6.KIND = "三";

        System.out.println(h.name);

        System.out.println(Homework6.KIND);

        System.out.println(h.gatHomework());

        System.out.println(Homework6.gatHomework1());

    }
}
