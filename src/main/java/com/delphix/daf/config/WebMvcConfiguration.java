package com.delphix.daf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
	  registry.addMapping("/**")
	          .allowedOrigins("http://localhost")
	          .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
	          .allowCredentials(true);
	}

}
