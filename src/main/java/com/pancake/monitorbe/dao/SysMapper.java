package com.pancake.monitorbe.dao;

import com.pancake.monitorbe.entity.Sys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author PancakeCN
 * @date 2022/3/2 2:03
 */
public interface SysMapper {

    /**
     * 获取所有系统列表
     *
     * @return java.util.ArrayList<com.pancake.monitorbe.entity.Sys>
     * @author PancakeCN
     * @date 2022/3/14 15:56
     */
    ArrayList<Sys> getAllSystemList();

    int insertOneSystem();

    int updateOneSystem();

    int deleteOneSystem();
}
