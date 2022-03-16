package com.pancake.monitorbe.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 登录参数
 * @author PancakeCN
 * @date 2022/3/3 20:22
 */
@Data
public class LoginParam implements Serializable {

    @ApiModelProperty("登录名")
    @NotEmpty(message = "登录名不能为空")
    private String loginName;

    @ApiModelProperty("用户密码（需要MD5加密）")
    @NotEmpty(message = "密码不能为空")
    private String passwordMd5;
}
