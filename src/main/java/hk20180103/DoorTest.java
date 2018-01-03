/**
 * Project Name:lession1
 * File Name:DoorTest.java
 * Package Name:lession9
 * Date:2018��1��3������10:20:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180103;

/**
 * Description: <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 1.门：开门，关门；锁：开锁，关锁；防盗门；门，锁<br>
 *      2.运动员：篮球运动员，跨栏运动员；学生；中学生，大学生；学习英语的技能：运动员，学生<br>
 *      3.鼠标：有线鼠标，无线鼠标；键盘：有线键盘，无线键盘；USB接口；鼠标，键盘
 */
public class DoorTest {

    public static void main(String[] args) {
        TestDoor d = new TestDoor();
        d.close();
        d.openlock();
        d.lockup();
        d.open();
    }

}
