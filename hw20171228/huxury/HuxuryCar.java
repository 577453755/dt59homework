/**
 * Project Name:dt59homework
 * File Name:HuxuryCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午5:45:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午5:45:05 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class HuxuryCar extends Car {
    HuxuryCar(int site, String name) {
        setSite(site);
        setName(name);
    }

    @Override
    public void summary() {
        System.out.println("车型是：" + getName() + "," + "核载量" + getSite() + "吨");
    }

    public static void main(String[] args) {

        HuxuryCar car = new HuxuryCar(2, "豪华跑车");
        car.summary();

    }

}
