package com.pancake.monitorbe.controller;

import com.pancake.monitorbe.model.Result;
import com.pancake.monitorbe.service.TerminalService;
import com.pancake.monitorbe.util.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author PancakeCN
 * @link https://github.com/PancakeCN
 * @date 2022/3/14 2:50
 */
@RestController
@Api(value = "v1", tags = "终端（Terminal）相关接口")
@RequestMapping("/api/v1/tm")
public class TerminalController {

    @Resource
    TerminalService terminalService;

    @ApiOperation("获取所有终端信息")
    @GetMapping("/getAllTerminalList")
    public Result<Object> getAllTerminalList(){
        return ResultGenerator.genSuccessResult(terminalService.getAllTerminalList());
    }
}
