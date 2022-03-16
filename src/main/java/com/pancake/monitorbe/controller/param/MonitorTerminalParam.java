package com.pancake.monitorbe.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author PancakeCN
 * @date 2022/3/3 21:39
 */
@Data
public class MonitorTerminalParam implements Serializable {

    @ApiModelProperty("系统名")
    private String sysName;

    @ApiModelProperty("终端名")
    private String tmName;

    @ApiModelProperty("IP地址")
    private String tmIp;

    @ApiModelProperty("最后更新时间")
    private String lastUpdateTime;

    @ApiModelProperty("心跳状态")
    private Integer heartStat;

    @ApiModelProperty("数据状态")
    private Integer DataStat;

}
