package com.pancake.monitorbe.controller;

import com.pancake.monitorbe.model.Result;
import com.pancake.monitorbe.service.SysService;
import com.pancake.monitorbe.util.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 2:49
 */
@Api(value = "v1", tags = "系统（System）相关接口")
@RestController
@RequestMapping("/api/v1/sys")
public class SysController {

    private static final Logger logger = LoggerFactory.getLogger(SysController.class);

    @Resource
    SysService sysService;

    @ApiOperation(value = "获取所有终端列表")
    @GetMapping("/getAllSystemList")
    public Result<Object> getAllSystemList(){
        return ResultGenerator.genSuccessResult(sysService.getAllSystemList());
    }
}
