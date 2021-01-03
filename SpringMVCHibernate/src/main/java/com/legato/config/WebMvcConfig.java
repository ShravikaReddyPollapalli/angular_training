package com.legato.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
//Scan the packages mentioned in basepackage for creating beans of classes having annotations
//like @Controller,@Service, @Repository and @Component
@ComponentScan(basePackages = {"com.legato.controller"})
public class WebMvcConfig {
	/* @Bean tag is used for creating beans using java based configuration */
	@Bean(name = "viewResolver")
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(".jsp");
		resolver.setPrefix("/WEB-INF/views/");
		return resolver;
	}
}
