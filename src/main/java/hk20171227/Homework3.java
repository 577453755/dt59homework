/**
 * Project Name:dt59homework
 * File Name:Homework3.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午2:34:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description:10.3.
 * 编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值； <br/>
 * Date: 2017年12月27日 下午2:34:28 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Homework3 {

    int i;

    double d;

    public Homework3() {

    }

    public Homework3(int i, double d) {

        this.i = i;
        this.d = d;
    }

    public static void main(String[] args) {
        Homework3 homework3 = new Homework3(1, 1.5);
        System.out.println(homework3.i);
        System.out.println(homework3.d);
    }

}
