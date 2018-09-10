package com.imooc.sellbymyself.utils;

import java.util.Random;

/**
 * @author hekai
 * @date 2018/9/7 0007 下午 19:04
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);

    }
}
