package com.xmy.springboot_demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author angtai
 */
@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.xmy.springboot_demo.*"})
@EnableSwagger2
@MapperScan(value = "com.xmy.springboot_demo.mapper")
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        // 启动应用程序，返回应用程序上下文
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
        //通过getEnvironment(),getProperty()方法获取配置属性值
        String port = context.getEnvironment().getProperty("server.port");
        log.info("swagger started url: http://localhost:" + port + "/swagger-ui.html");
    }

}
