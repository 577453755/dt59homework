/**
 * Project Name:dt59homework
 * File Name:TestTypeDefaultValue.java
 * Package Name:hk20171227
 * Date:2017年12月27日下午2:06:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171227;

/**
 * Description: Description:10.1.
 * 编写一个类TypeDefaultValue，并定义十个属性，前八个属性分别定义为8种基本数据类型；
 * 最后两属性类型分别定义为String和int[];编写另一个类TestTypeDefaultValue，
 * 定义main方法，在main方法，输出TypeDefaultValue类对象的每一个属性值； <br>
 * 观察每种类型属性，默认值是什么，并以注释的形式在属性前说明。 <br/>
 * Date: 2017年12月27日 下午2:01:42 <br/>
 * <br/>
 * Date: 2017年12月27日 下午2:06:11 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class TestTypeDefaultValue {
    public static void main(String[] args) {
        TypeDefaultValue t = new TypeDefaultValue();
        System.out.println("char:" + t.c);
        System.out.println("boolean:" + t.boo);
        System.out.println("byte:" + t.b);
        System.out.println("long:" + t.l);
        System.out.println("double:" + t.d);
        System.out.println("short:" + t.s);
        System.out.println("int:" + t.i);
        System.out.println("folat:" + t.f);
        System.out.println("String:" + t.str);
        System.out.println("int[]:" + t.ii);
    }
}
