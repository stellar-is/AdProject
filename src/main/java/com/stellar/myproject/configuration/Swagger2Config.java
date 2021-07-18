package com.stellar.myproject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    public static final String ORDER = "Реклама";
    public static final String CHANNEL = "Канал";
    public static final String PRICE = "Цены";
    public static final String CLIENT = "Клиент";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.stellar.myproject.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo())
                .tags(new Tag(ORDER, ""))
                .tags(new Tag(CHANNEL, ""))
                .tags(new Tag(PRICE, ""))
                .tags(new Tag(CLIENT, ""));
    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("AdProject")
                .description("Бэкенд для проекта AdProject")
                .version("1.0.0")
                .contact(new Contact("Дадабаев Искандар", "http://www.megacom.kg", "iskandardadabev@gmaol.kg"))
                .build();
    }
}