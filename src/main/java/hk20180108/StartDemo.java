/**
 * Project Name:lession1
 * File Name:StartDemo.java
 * Package Name:lession14
 * Date:2018��1��8������10:21:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180108;

/**
 * Description: <br/>
 * Date: 2018��1��8�� ����10:21:09 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class StartDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadDemo p = new ThreadDemo(i);
            new Thread(p).start();
        }
    }
}
