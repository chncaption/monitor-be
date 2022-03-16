package com.pancake.monitorbe.service.impl;

import com.pancake.monitorbe.controller.param.MonitorTerminalParam;
import com.pancake.monitorbe.entity.Sys;
import com.pancake.monitorbe.entity.Terminal;
import com.pancake.monitorbe.dao.SysMapper;
import com.pancake.monitorbe.dao.TerminalMapper;
import com.pancake.monitorbe.service.MonitorService;
import com.pancake.monitorbe.model.StatResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务层-终端展示页-实现类
 *
 * @author PancakeCN
 * @date 2022/3/2 1:34
 */
@Service
public class MonitorServiceImpl implements MonitorService {

    @Resource
    private SysMapper sysMapper;
    @Resource
    private TerminalMapper terminalMapper;


    @Override
    public List<Terminal> getAllTerminalList() {
        return terminalMapper.getAllTerminals();
    }

    @Override
    public List<MonitorTerminalParam> getMonitorTerminalList() {
        //List<MonitorTerminalParam> monitorTerminals = terminalMapper.getMonitorTerminals();

        return terminalMapper.getMonitorTerminals();
    }

    @Override
    public List<Sys> getAllSystemList() {
        return sysMapper.getAllSystemList();
    }

    @Override
    public Integer getTerminalsCount() {
        return terminalMapper.getTerminalsCount();
    }

    @Override
    public StatResult getHeartStatCount() {
        StatResult sr = new StatResult();

        sr.setGreenCount(terminalMapper.getGreenHeartStatCount());
        sr.setYellowCount(terminalMapper.getYellowHeartStatCount());
        sr.setRedCount(terminalMapper.getRedHeartStatCount());
        return sr;
    }

    @Override
    public StatResult getDataStatCount() {
        StatResult sr = new StatResult();

        sr.setGreenCount(terminalMapper.getGreenDataStatCount());
        sr.setYellowCount(terminalMapper.getYellowDataStatCount());
        sr.setRedCount(terminalMapper.getRedDataStatCount());
        return sr;
    }
}
