/**
 * Project Name:dt59homework
 * File Name:Woman.java
 * Package Name:hk20180102
 * Date:2018年1月2日下午5:21:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:21:26 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Woman extends Person {
    private boolean beautiful;

    public boolean isBeautiful() {
        return beautiful;
    }

    public void setBeautiful(boolean beautiful) {
        this.beautiful = beautiful;
    }

    @Override
    public void eat() {
        System.out.println("女人要少吃，减肥！");
    }

    @Override
    public void walk() {
        System.out.println("女人文静的走路");
    }

    public void shopping() {
        System.out.println("女人喜欢购物");
    }

}
