/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:47:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:47:22 <br/>
 * @author   zhangxingyu
 * @version
 * @see
 */

/**
 * 1) 在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()<br>
 * ，输出车的概要信息，再自由定义两个属性、两个方法；<br>
 * 定义一个小汽车的类和大卡车的类，<br>
 * 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法 <br>
 * Description: <br/>
 * date: 2017年12月29日 下午3:47:47 <br/>
 *
 * @author 57745
 * @version
 */
public abstract class Car {
    private int site = 3;

    private String name = "小轿车";

    public Car() {
        System.out.println("车辆类型是：" + this.name + "," + "核载量：" + this.site + "吨");
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
        System.out.println("车辆类型是：" + site + "核载量：" + name + "吨");
    }
}
