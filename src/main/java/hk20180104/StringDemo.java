/**
 * Project Name:lession1
 * File Name:String.java
 * Package Name:lession10
 * Date:2018年1月4日下午2:20:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:20:22 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 6.1. 查看jdk api，列出String对象有哪些属性、方法，并写出使用示例（五个方法）
 */
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {
        /**
         * java.lang.Object<br>
         * 继承者 java.lang.String<br>
         * 所有已实现的接口： <br>
         * Serializable, CharSequence, Comparable<String> <br>
         */
        String str = "abc".toUpperCase();// 转换大写
        LOG.info(str);
        String str1 = "ABC".toLowerCase();// 转换小写
        LOG.info(str1);
        LOG.info(Integer.toString(1));// 返回 int 参数的字符串表示形式。
        String str2 = " 123 ".trim();// 返回字符串的副本，忽略前导空白和尾部空白。
        LOG.info(str2);
        String str3 = "      321   ".intern();// 返回字符串对象的规范化表示形式。
        LOG.info(str3);
    }
}
