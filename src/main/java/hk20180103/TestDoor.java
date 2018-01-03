/**
 * Project Name:lession1
 * File Name:TestDoor.java
 * Package Name:lession9
 * Date:2018��1��3������10:14:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180103;

/**
 * Description: <br/>
 * Date: 2018��1��3�� ����10:14:25 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class TestDoor implements Door, Lock {

    @Override
    public void lockup() {
        System.out.println("钥匙向左扭三圈，门开了");
    }

    @Override
    public void openlock() {
        System.out.println("钥匙向右扭三圈，门锁了");
    }

    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }

}
