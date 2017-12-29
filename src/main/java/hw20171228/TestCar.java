/**
 * Project Name:dt59homework
 * File Name:TestCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:54:52
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:54:52 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */

/**
 * 2) 接第1题，在小汽车类中，添加输出小洗车整体介绍信息方法，方法中，除输出小洗车本类中的属性外，还要输出父类中的属性信息。<br>
 * Description: <br/>
 * date: 2017年12月29日 下午4:06:31 <br/>
 *
 * @author 57745
 * @version
 */
public class TestCar extends Car {
    TestCar(int site, String name) {
        setSite(site);
        setName(name);
    }

    @Override
    public void summary() {
        System.out.println("车辆类型是：" + this.getName() + "," + "核载量：" + this.getSite() + "吨");
    }

    public static void main(String[] args) {
        TestCar car = new TestCar(15, "大卡车");
        car.summary();
    }
}
