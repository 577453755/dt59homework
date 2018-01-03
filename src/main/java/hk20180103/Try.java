/**
 * Project Name:lession1
 * File Name:Try.java
 * Package Name:lession9
 * Date:2018��1��3������11:03:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018��1��3�� ����11:03:48 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class Try {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        System.out.println("请输出2个数值ֵ:");
        Scanner sc = new Scanner(System.in);
        try {
            int val = sc.nextInt();
            int val1 = sc.nextInt();
            int val2 = val / val1;
            System.out.println(val2);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            sc.close();
        }
        LOG.info(sc);

    }
}
