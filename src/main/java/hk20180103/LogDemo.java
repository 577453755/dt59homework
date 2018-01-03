/**
 * Project Name:dt59homework
 * File Name:Demo1.java
 * Package Name:hk20180103
 * Date:2018年1月3日下午2:14:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:14:56 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class LogDemo {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            LOG.info("输入字符串长度：");
            String str = sc.next();
            int len = str.length();
            if (len < 3) {
                throw new NullPointerException("输入有误");
            }
            // int val = sc.nextInt();
            // int val1 = sc.nextInt();
            // int val2 = val / val1;
            // System.out.println(val2);
            // LOG.info(val);
            // LOG.info(val1);
            // LOG.info(val2);
        } catch (NullPointerException e1) {
            e1.printStackTrace();
            LOG.info(e1);
            // } catch (Exception e) {
            // e.printStackTrace();
            // LOG.info(e);

        } finally {
            sc.close();
        }

    }

}