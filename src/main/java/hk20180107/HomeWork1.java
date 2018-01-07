/**
 * Project Name:lession1
 * File Name:HomeWork1.java
 * Package Name:lession13
 * Date:2018年1月7日下午12:55:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180107;


/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:55:46 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 5.1. 编程输出指定目录中的所有文件（包括子目录中的文件）。<br>
 */
public class HomeWork1 {

    public static void main(String[] args) throws Exception {
        FileList fl = new FileList("E:\\workspace", "E:\\1.txt");// 输出文件列表到txt文件
        fl.getList();
    }
}
