/**
 * Project Name:lession1
 * File Name:PrimeRun.java
 * Package Name:lession14
 * Date:2018��1��8������1:51:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018��1��8�� ����1:51:31 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see
 */
public class PrimeRun extends Thread {
    private final static Logger LOG = Logger.getLogger(PrimeRun.class);

    int j;

    private String vip = "";

    public PrimeRun(int i) {
        this.j = i;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public void run() {
        LOG.info("第" + j + "个" + vip);
    }

}
