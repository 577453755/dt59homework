/**
 * Project Name:dt59homework
 * File Name:Man.java
 * Package Name:hk20180102
 * Date:2018年1月2日下午5:19:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:19:28 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Man extends Person {
    private boolean smoking;

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    @Override
    public void eat() {
        System.out.println("男人要多吃肉，变壮！");
    }

    @Override
    public void walk() {
        System.out.println("男人豪迈的走路");
    }

    public void game() {
        System.out.println("男人喜欢电子游戏");
    }

}
