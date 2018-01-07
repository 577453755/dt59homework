/**
 * Project Name:lession1
 * File Name:HomeWork3.java
 * Package Name:lession13
 * Date:2018年1月7日下午12:40:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180107;

import hk20180103.LogDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:40:11 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 5.3. 日期对象输出格式的模板的所有关键字，都需要熟悉，写出几个模板的输出效果 <br>
 */
public class HomeWork3 {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) throws ParseException {
        /**
         * 字符串转换为java.util.Date<br>
         * 支持格式为 yyyy.MM.dd G 'at' hh:mm:ss z 如 '2002-1-1 AD at 22:10:59 PSD'<br>
         * yy/MM/dd HH:mm:ss 如 '2002/1/1 17:55:00'<br>
         * yy/MM/dd HH:mm:ss pm 如 '2002/1/1 17:55:00 pm'<br>
         * yy-MM-dd HH:mm:ss 如 '2002-1-1 17:55:00' <br>
         * yy-MM-dd HH:mm:ss am 如 '2002-1-1 17:55:00 am' <br>
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2017-10-8 15:30:22");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String datestr = sdf1.format(new Date());
        LOG.info(date);
        LOG.info(datestr);
        LOG.info(Now(0));// 输出当前时间

    }

    public static String Now(int hour) {// 当前时间
        return dateToString(new Date(), hour);
    }

    private static String dateToString(Date date, int hour) {

        // Auto-generated method stub
        return null;
    }

}