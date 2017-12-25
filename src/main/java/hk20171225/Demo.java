/**
 * Project Name:dt59homework
 * File Name:Demo.java
 * Package Name:hk20171225
 * Date:2017年12月25日下午5:12:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171225;

import java.util.Scanner;

/**
 * Description: A) 编写一个方法，传入两个数值，返回较大的一个值； <br/>
 * Date: 2017年12月25日 下午5:12:40 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("请输入2个数值：");
        Demo demo = new Demo();
        System.out.println("最大值是：");
        demo.a();
    }

    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();

    int j = sc.nextInt();

    int[] ary = new int[] { k, j };

    void a() {
        int max = ary[0];
        for (int i = 0; i < ary.length; i++) {
            if (max < ary[i]) {
                max = ary[i];
            }
        }
        System.out.println(max);
    }
}