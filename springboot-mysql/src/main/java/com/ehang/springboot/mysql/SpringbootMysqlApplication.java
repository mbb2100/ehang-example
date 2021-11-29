package com.ehang.springboot.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.ehang.springboot.mysql.**.mapper"})
@EnableAsync
public class SpringbootMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysqlApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
