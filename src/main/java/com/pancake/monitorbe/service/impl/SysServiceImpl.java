package com.pancake.monitorbe.service.impl;

import com.pancake.monitorbe.dao.SysMapper;
import com.pancake.monitorbe.entity.Sys;
import com.pancake.monitorbe.service.SysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * 业务层-系统-实现类
 *
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 1:17
 */
@Service
public class SysServiceImpl implements SysService {

    @Resource
    SysMapper sysMapper;

    @Override
    public ArrayList<Sys> getAllSystemList() {
        return sysMapper.getAllSystemList();
    }
}
