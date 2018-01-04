/**
 * Project Name:lession1
 * File Name:MapDemo.java
 * Package Name:lession10
 * Date:2018年1月4日下午3:21:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hk20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:21:28 <br/>
 * 
 * @author zhangxingyu
 * @version
 * @see 6.2. List、Map 做练习：添加、修改、删除 、查询 、插入、遍历
 */
public class MapDemo {
    private final static Logger LOG = Logger.getLogger(MapDemo.class);

    public static void main(String[] args) {

        Map map = new HashMap();

        LOG.info("Map的长度：" + map.size());

        map.put("楔形石碎片", "强化0-3");// 添加
        map.put("楔形石大碎片", "强化3-6");
        map.put("楔形石块", "强化6-9");
        map.put("楔形石圆盘", "强化10");

        LOG.info("Map的长度：" + map.size());

        LOG.info("楔形石碎片对应的值：" + map.get("楔形石碎片"));// 查询
        LOG.info("楔形石大碎片对应的值：" + map.get("楔形石大碎片"));
        LOG.info("楔形石块对应的值：" + map.get("楔形石块"));
        LOG.info("楔形石圆盘对应的值：" + map.get("楔形石圆盘"));

        Iterator ite = map.keySet().iterator();

        while (ite.hasNext()) {// 遍历
            LOG.info(ite.next());

        }
        map.clear();// 删除
        LOG.info("Map的长度：" + map.size());
    }

}
