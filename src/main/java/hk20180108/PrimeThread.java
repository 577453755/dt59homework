/**
 * Project Name:lession1
 * File Name:PrimeThread.java
 * Package Name:lession14
 * Date:2018��1��8������1:53:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180108;

/**
 * Description: <br/>
 * Date: 2018��1��8�� ����1:53:56 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class PrimeThread {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            PrimeRun pr = new PrimeRun(i);
            pr.start();
            if (i % 8 == 0) {
                pr.setVip("vip");
                pr.setPriority(Thread.MAX_PRIORITY);
            }

            if (i == 1) {
                pr.setPriority(Thread.MIN_PRIORITY);
                pr.setVip("˥");
            }
        }

    }

}
