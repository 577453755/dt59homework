/**
 * Project Name:dt59homework
 * File Name:Person.java
 * Package Name:hk20180102
 * Date:2018年1月2日下午5:17:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:17:07 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 1.父类：笔类 Pen<br>
 *      子类：铅笔pencil，钢笔fountain；<br>
 *      多态的方法：铅笔用铅，钢笔用墨<br>
 *      2.父类：人类 Person<br>
 *      子类：男人 Man，女人Woman；<br>
 *      多态的方法：吃饭，走路<br>
 *      3.父类：鱼类 Fish<br>
 *      子类：小鱼Tiddler，大鱼BigFish；<br>
 *      多态的方法：大鱼吃小鱼，小鱼吃虾米<br>
 */
public abstract class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

    public abstract void walk();
}
