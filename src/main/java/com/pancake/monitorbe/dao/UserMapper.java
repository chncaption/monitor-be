package com.pancake.monitorbe.dao;

import com.pancake.monitorbe.entity.User;
import com.pancake.monitorbe.model.UserResult;

import java.util.ArrayList;

/**
 * 用户表dao层
 * @author PancakeCN
 * @date 2022/2/12 2:31
 */
public interface UserMapper {
    /**
     * 登录验证
     *
     * @param loginName 登录名
     * @param password 密码
     * @return com.pancake.monitorbe.entity.User
     * @author PancakeCN
     * @date 2022/3/12 10:54
     */
    User login(String loginName, String password);

    /**
     * 查询所有用户（筛选后）
     *
     * @author PancakeCN
     * @date 2022/2/12 3:07
     * @return List<User>
     */
    ArrayList<UserResult> getAllUserList();

    /**
     * 获取所有登录名列表（当为普通用户）
     *
     * @return java.util.ArrayList<java.lang.String>
     * @author PancakeCN
     * @date 2022/3/15 1:52
     */
    ArrayList<String> getNormalLoginNameList();

    /**
     * 插入一个用户
     * @author PancakeCN
     * @date 2022/2/12 3:07
     * @param user User
     * @return int
     */
    int insertUser(User user);

    /**
     * 修改一个用户
     * @author PancakeCN
     * @date 2022/2/12 3:09
     * @param user User
     * @return int
     **/
    int updateUser(User user);

    /**
     * 删除一个用户
     * @author PancakeCN
     * @date 2022/2/12 3:10
     * @param loginName String
     * @return int
     */
    int deleteUser(String loginName);
}
