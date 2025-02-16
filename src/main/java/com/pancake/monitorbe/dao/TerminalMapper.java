package com.pancake.monitorbe.dao;

import com.pancake.monitorbe.controller.param.MonitorTerminalParam;
import com.pancake.monitorbe.entity.Terminal;

import java.util.List;

/**
 * @author PancakeCN
 * @date 2022/3/2 1:52
 */
public interface TerminalMapper {
    /**
     * 查询所有终端
     * @author PancakeCN
     * @date 2022/3/2 1:54
     * @return java.util.List<com.pancake.monitorbe.entity.Terminal>
     */
    List<Terminal> getAllTerminals();

    /**
     * 查询所有终端表（双表联合查询）
     * @author PancakeCN
     * @date 2022/3/2 10:26
     * @return java.util.List<com.pancake.monitorbe.entity.Terminal>
     */
    List<MonitorTerminalParam> getMonitorTerminals();

    Integer getTerminalsCount();

    Integer getGreenHeartStatCount();

    Integer getYellowHeartStatCount();

    Integer getRedHeartStatCount();

    Integer getGreenDataStatCount();

    Integer getYellowDataStatCount();

    Integer getRedDataStatCount();

    /**
     * 插入一条终端
     * @author PancakeCN
     * @date 2022/3/2 2:01
     * @return int
     */
    int insertOneTerminal();

    int updateOneTerminal();

    int deleteOneTerminal();
}
