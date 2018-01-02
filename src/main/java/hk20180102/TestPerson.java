/**
 * Project Name:dt59homework
 * File Name:TestPerson.java
 * Package Name:hk20180102
 * Date:2018年1月2日下午5:23:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:23:59 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class TestPerson {
    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new Woman();

        man.eat();
        man.walk();
        if (man instanceof Man) {
            Man m1 = (Man) man;
            m1.game();
        }
        System.out.println();
        woman.eat();
        woman.walk();
        if (woman instanceof Woman) {
            Woman w1 = (Woman) woman;
            w1.shopping();
        }

    }

}
