package com.pancake.monitorbe.entity;

import lombok.Data;

/**
 * 系统
 *
 * @author PancakeCN
 * @date 2022/3/2 1:46
 */
@Data
public class Sys {
    /**系统识别码*/
    private String sysCode;
    /**系统名*/
    private String sysName;
    /**系统名缩写*/
    private String sysNameAbbr;
    /**终端数*/
    private String tmCount;
}
