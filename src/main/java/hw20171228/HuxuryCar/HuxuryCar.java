/**
 * Project Name:dt59homework
 * File Name:HuxuryCar.java
 * Package Name:hw20171228.HuxuryCar
 * Date:2017年12月29日下午4:14:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.HuxuryCar;

import hw20171228.Car;

/**
 * 3) 在hw20171228.huxury类包中，编写一个豪华汽车的类，要求继承第1题中车的抽象类，<br>
 * 重写车的简介方法summary()，输出信息中，包括“我是豪车。。。”形式的内容，并添加相应属性方法。<br>
 * Description: <br/>
 * Date: 2017年12月29日 下午4:14:05 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class HuxuryCar extends Car {
    HuxuryCar(int site, String name) {
        setName(name);
        setSite(site);
    }

    @Override
    public void summary() {
        System.out.println("车辆类型是：" + this.getName() + ", " + "核载量：" + this.getSite() + "吨");
    }

    public static void main(String[] args) {
        HuxuryCar car = new HuxuryCar(2, "我是豪车");
        car.summary();
    }
}
