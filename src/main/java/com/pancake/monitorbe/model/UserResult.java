package com.pancake.monitorbe.model;

import lombok.Data;

/**
 * 用户信息（部分）
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/15 1:07
 */
@Data
public class UserResult {

    /**登录名*/
    private String loginName;
    /**用户名*/
    private String username;
    /**密码*/
    private String password;
    /**权限*/
    private int auth;
    /**权限描述*/
    private String authComment;
    /**电话号码*/
    private String phoneNumber;

    public UserResult(String loginName, String username, String password, int auth, String authComment, String phoneNumber) {
        this.loginName = loginName;
        this.username = username;
        this.password = password;
        this.auth = auth;
        this.authComment = authComment;
        this.phoneNumber = phoneNumber;
    }
}
