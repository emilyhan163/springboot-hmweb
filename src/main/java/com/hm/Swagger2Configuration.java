package com.hm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author hmj
 * @date 2019/7/4
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    private static final String BASE_PACKAGE = "com.hm.web.hmweb.controller";

    private static final String GROUP_NAME = "user";

    @Bean
    public Docket createRestApi() {
        //enable 此处没有根据环境判断Swagger是否可用
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .groupName(GROUP_NAME)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("用户相关接口文档")
                .contact(new Contact("hm", "", "xxx.com"))
                .build();

    }

}
