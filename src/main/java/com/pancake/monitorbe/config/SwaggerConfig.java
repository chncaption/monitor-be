package com.pancake.monitorbe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * RESTful API 接口文档生成配置
 * @author PancakeCN
 * @date 2022/3/1 17:31
 */
@Configuration
@EnableOpenApi
@EnableWebMvc
public class SwaggerConfig {

    /**
     * 通过 createRestfulApi函数来构建一个DocketBean（Swagger API 摘要）
     */
    @Bean
    public Docket createRestfulApi(){
        return new Docket(DocumentationType.OAS_30)
                //调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .apiInfo(apiInfo())
                .select()
                //设置通过什么方式定位需要自动生成文档的接口
                //如果某个接口不想暴露,可以使用以下注解
                //@ApiIgnore 这样,该接口就不会暴露在 swagger2 的页面下
                .apis(RequestHandlerSelectors.basePackage("com.pancake.monitorbe.controller"))
                //.apis(RequestHandlerSelectors.any())
                //接口URI路径设置，any是全路径，也可以通过PathSelectors.regex()正则匹配
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建 api文档的详细信息函数
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("monitor-be接口文档")
                .description("swagger文档 by PancakeCN")
                .version("1.0")
                .build();
    }
}
