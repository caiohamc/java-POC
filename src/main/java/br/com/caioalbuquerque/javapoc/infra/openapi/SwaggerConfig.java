package br.com.caioalbuquerque.javapoc.infra.openapi;

import java.util.Collections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.data.domain.Example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    @ConditionalOnMissingBean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
            .apiInfo(new ApiInfoBuilder()
                .title("Java POC")
                .description("Java POC Backend Application")
                .version("1.0")
                .license("License")
                .extensions(Collections.emptyList())
                .build())
            .ignoredParameterTypes(Example.class)
            .forCodeGeneration(false)
            .useDefaultResponseMessages(false)
            .select()
            .build();
    }
}
