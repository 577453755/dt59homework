/**
 * Project Name:dt59homework
 * File Name:Homework5.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午3:19:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description:10.5. 编写一个类，定义几个属性，每个属性前添加private修饰符；为每个属性，添加get/set方法，<br>
 * 方法前添加public修饰符；再编写一个类，定义main方法，在main方法中，构造前一个类的实例对象，<br>
 * 并调用实例对象的set方法，设置对应数据值；最后调用get方法，输出对应属性值到控制台。 <br/>
 * Date: 2017年12月27日 下午3:19:49 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Homework5 {
    private int i;

    private double d;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;

    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

}
