/**
 * Project Name:lession1
 * File Name:HomeWork2.java
 * Package Name:lession13
 * Date:2018年1月7日下午12:39:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180107;

import hk20180103.LogDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:39:51 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 5.2. 编程实现文件的拷贝功能。<br>
 */

class HomeWork2 {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    static void copy(String from, String to) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(from));
        BufferedWriter out = new BufferedWriter(new FileWriter(new File(to)));
        String line = null;
        while ((line = in.readLine()) != null) {
            out.write(line + "\n");
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        LOG.info("请输入文件路径：");
        String from = sc.next();
        LOG.info("请输入拷贝路径：");
        String to = sc.next();
        copy(from, to);
        sc.close();
    }
}