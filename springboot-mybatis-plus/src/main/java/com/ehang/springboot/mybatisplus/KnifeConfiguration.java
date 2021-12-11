package com.ehang.springboot.mybatisplus;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LENOVO
 * @title: KnifeConfiguration
 * @projectName tilldream-parent
 * @description: TODO
 * @date 2021/11/16 11:28
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class KnifeConfiguration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("V1版本")
                .select()
                //.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .apis(RequestHandlerSelectors.basePackage("com.ehang"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("MPJ测试")
                .description("mybatis-plus-join测试")
                .version("1.0")
                .build();
    }
}
