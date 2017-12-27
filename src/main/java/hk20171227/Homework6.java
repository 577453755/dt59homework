/**
 * Project Name:dt59homework
 * File Name:Homework6.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午3:50:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description: 10.6.
 * 编写一个类，定义两个属性，其中一个属性前添加static关键字；再定义两个方法，其中一个方法前添加static关键字；
 * 再编写一个类，定义main方法，在main方法中，分别输出前一个类的两个属性，以及调用两个方法；注意观察不同处，并写上注释 <br/>
 * Date: 2017年12月27日 下午3:50:00 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Homework6 {
    String name;// 常态

    static String KIND;// 静态

    public String gatHomework() {// 常态方法可以用常态和静态
        return name + KIND;
    }

    public static String gatHomework1() {// static的方法只能用static的属性
        return KIND;
    }
}
