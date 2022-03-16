package com.pancake.monitorbe.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "v1", tags = "测试样例（Demo）接口")
@RequestMapping("/api/v1/demo")
public class DemoController {

    @ApiOperation("测试 hello 接口")
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
