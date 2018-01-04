/**
 * Project Name:lession1
 * File Name:ListDemo.java
 * Package Name:lession10
 * Date:2018年1月4日下午2:50:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180104;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:50:04 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 6.2. List、Map 做练习：添加、修改、删除 、查询 、插入、遍历
 */
public class ListDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {
        List list = new ArrayList();// 长度为10
        list.add("中");// 添加
        list.add(9);
        list.add(false);
        list.add("a");

        for (int i = 0; i < 10; i++) {// 遍历
            list.add(i);
        }

        int size = list.size();
        LOG.info("元素的个数:" + size);

        Object obj = list.get(2);// 查询
        LOG.info(obj);

        list.add(4, "123");// 插入
        LOG.info("元素的新个数：" + list.size());
        Object obj2 = list.get(3);// 查询
        LOG.info(obj2);
        list.remove(3);// 删除
        Object obj3 = list.get(3);// 查询
        LOG.info(obj3);

        Object obj1 = list.get(1);// 查询
        LOG.info(obj1);

        list.set(1, "发");// 修改
        Object obj4 = list.get(1);// 查询
        LOG.info(obj4);

    }

}
