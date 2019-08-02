package com.springboot.email.common.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description swagger config
 * @Author 2985062714@qq.com
 * @Date 2019/8/2 16:26
 * @Version 1.0
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket mailApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("邮件管理").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.email.web")).paths(PathSelectors.any()).build();
    }
    // 预览地址:swagger-ui.html
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Spring 中使用Swagger2构建文档").termsOfServiceUrl("https://blog.52itstyle.com/")
                .contact(new Contact("zhb", "112.74.170.55", "2985062714@qq.com")).version("1.1").build();
    }

}
