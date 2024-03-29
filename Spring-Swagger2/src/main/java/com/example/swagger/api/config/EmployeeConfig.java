package com.example.swagger.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class EmployeeConfig {
	
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Dhiraj").apiInfo(apiInfo()).select()
				.paths(regex("/book.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee project")
				.description("Sample Documentation Generateed Using SWAGGER")
				.termsOfServiceUrl("1994dhirajchavhan@gmail.com")
				.license("All rights are reserved")
				.licenseUrl("1994dhirajchavhan@gmail.com").version("1.0").build();
	}

}
