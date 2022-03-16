package com.pancake.monitorbe.dao;

import com.pancake.monitorbe.model.UserSysResult;

import java.util.ArrayList;

/**
 * 用户-系统映射
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 18:21
 */
public interface UserSysMapper {

    /**
     * 通过loginName查询sysCode
     *
     * @param loginName 登录名
     * @return java.util.ArrayList<java.lang.String>
     * @author PancakeCN
     * @date 2022/3/14 18:46
     */
    ArrayList<UserSysResult> getAllUserSysListByLoginName(String loginName);

}
