/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017骞�2鏈�9鏃ヤ笅鍗�:47:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */

public abstract class Car {
    private int site = 3;

    private String name = "小汽车";

    public Car() {
        System.out.println("车型是：" + this.name + "," + "核载量" + this.site + "吨");
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void summary() {
        System.out.println("车型是：" + site + "," + "核载量" + name + "吨");
    }
}