/**
 * Project Name:dt59homework
 * File Name:vip.java
 * Package Name:hk20171225
 * Date:2017年12月25日下午5:13:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hk20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:13:07 <br/>
 * @author   zhangxingyu
 * @version
 * @see
 */
/**
 * B)
 * 编写一个vip卡片类，定义vip等级属性，定义结算方法；结算方法传入购物金额，返回折扣后金额。结算方法处理逻辑：根据viP等级属性，给予不同打折优惠。<br/>
 * 至尊级：7.5 <br/>
 * 钻石级：8 <br/>
 * 铂金级：8.5 <br/>
 * 黄金级：9 <br/>
 * 白银级：9.5 <br/>
 * 
 * Description: <br/>
 * date: 2017年12月25日 下午5:13:25 <br/>
 *
 * @author 57745
 * @version
 */
public class Vip {
    String vip(int input) {
        if (input == 1) {
            System.out.println("您是至尊卡，可享受7.5折");
        } else if (input == 2) {
            System.out.println("您是钻石卡，可享受8折");
        } else if (input == 3) {
            System.out.println("您是铂金卡，可享受8.5折");
        } else if (input == 4) {
            System.out.println("您是黄金卡，可享受9折");
        } else if (input == 5) {
            System.out.println("您是白银卡，可享受9.5折");
        }
        return null;
    }

    String money(double m, int i) {
        if (i == 1) {
            System.out.println("实付金额" + m * 0.75);
        } else if (i == 2) {
            System.out.println("实付金额" + m * 0.8);
        } else if (i == 3) {
            System.out.println("实付金额" + m * 0.85);
        } else if (i == 4) {
            System.out.println("实付金额" + m * 0.9);
        } else if (i == 5) {
            System.out.println("实付金额" + m * 0.95);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vip vip = new Vip();
        System.out.println("请输入您的vip卡类型：" + "\n" + "1.至尊卡" + "\n" + "2.钻石" + "\n" + "3.铂金卡" + "\n" + "4.黄金卡" + "\n"
                + "5.白银卡");
        int a = sc.nextInt();
        vip.vip(a);
        System.out.print("请输入消费金额：");
        double b = sc.nextDouble();
        vip.money(b, a);
        sc.close();
    }
}
