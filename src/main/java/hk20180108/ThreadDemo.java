/**
 * Project Name:lession1
 * File Name:ThreadDemo.java
 * Package Name:lession14
 * Date:2018��1��8������10:15:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018��1��8�� ����10:15:27 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class ThreadDemo implements Runnable {
    private final static Logger LOG = Logger.getLogger(ThreadDemo.class);

    int str;

    public ThreadDemo(int str) {
        this.str = str;
    }

    @Override
    public void run() {
        LOG.info("第" + str + "个");
    }

}
