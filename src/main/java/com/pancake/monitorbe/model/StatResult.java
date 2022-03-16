package com.pancake.monitorbe.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 状态结果
 *
 * @author PancakeCN
 * @date 2022/3/2 11:22
 */
@Data
public class StatResult {

    @ApiModelProperty("正常/绿色状态数")
    private Integer greenCount;
    @ApiModelProperty("异常/黄色状态数")
    private Integer yellowCount;
    @ApiModelProperty("停止/红色状态数")
    private Integer redCount;
}
