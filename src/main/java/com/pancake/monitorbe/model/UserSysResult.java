package com.pancake.monitorbe.model;

import lombok.Data;

/**
 * 用户权限-所能管理的系统（部分）
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 16:44
 */
@Data
public class UserSysResult {

//    /**登录名*/
//    private String loginName;

    /**系统识别码*/
    private String sysCode;
    /**系统名*/
    private String sysName;
}
