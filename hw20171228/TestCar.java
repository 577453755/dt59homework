/**
 * Project Name:dt59homework
 * File Name:TestCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午5:44:33
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午5:44:33 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class TestCar extends Car {
    TestCar(int site, String name) {
        setSite(site);
        setName(name);
    }

    @Override
    public void summary() {
        System.out.println("车型是：" + getName() + "," + "核载量" + getSite() + "吨");
    }

    public static void main(String[] args) {
        TestCar car = new TestCar(15, "大货车");
        car.summary();

        // Auto-generated method stub

    }

}
