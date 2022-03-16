package com.pancake.monitorbe.service;

import com.pancake.monitorbe.controller.param.MonitorTerminalParam;
import com.pancake.monitorbe.entity.Sys;
import com.pancake.monitorbe.entity.Terminal;
import com.pancake.monitorbe.model.StatResult;

import java.util.List;

/**
 * 业务层-终端展示页-接口
 *
 * @author PancakeCN
 * @date 2022/3/2 1:32
 */
public interface MonitorService {

    /**
     * 获取所有终端信息（原始）
     *
     * @return java.util.List<com.pancake.monitorbe.entity.Terminal>
     * @author PancakeCN
     * @date 2022/3/14 1:23
     */
    List<Terminal> getAllTerminalList();

    /**
     * 获取所有终端信息（前台显示）
     *
     * @return java.util.List<com.pancake.monitorbe.controller.param.MonitorTerminalParam>
     * @author PancakeCN
     * @date 2022/3/14 1:24
     */
    List<MonitorTerminalParam> getMonitorTerminalList();

    List<Sys> getAllSystemList();

    /**
     * 获取当前终端总数
     *
     * @return java.lang.Integer
     * @author PancakeCN
     * @date 2022/3/14 1:26
     */
    Integer getTerminalsCount();

    /**
     * 获取心跳状态统计数
     *
     * @return com.pancake.monitorbe.modal.StatResult
     * @author PancakeCN
     * @date 2022/3/14 1:26
     */
    StatResult getHeartStatCount();

    /**
     * 获取数据状态统计数
     *
     * @return com.pancake.monitorbe.modal.StatResult
     * @author PancakeCN
     * @date 2022/3/14 1:27
     */
    StatResult getDataStatCount();
}
