package com.pancake.monitorbe.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * 数字工具类
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/12 10:22
 */
public class NumberUtil {
    private NumberUtil(){

    }

    /**
     * 判断是否为11为电话号码
     * @author PancakeCN
     * @date 2022/3/12 10:26
     * @param phone 电话号码
     * @return boolean
     */
    public static boolean isPhone(String phone) {
        Pattern pattern = compile("^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0-8])|(18[0-9]))\\d{8}$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    /**
     * 生成指定长度的随机数
     * @author PancakeCN
     * @date 2022/3/12 10:28
     * @param length 随机数长度
     * @return int
     */
    public static int genRandomNum(int length) {
        int num = 1;
        double random = Math.random();
        if (random < 0.1) {
            random = random + 0.1;
        }
        for (int i = 0; i < length; i++) {
            num = num * 10;
        }
        return (int) ((random * num));
    }


}
