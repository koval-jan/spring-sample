package com.sample.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.sample.app.controller" })
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		super.configureContentNegotiation(configurer);
		configurer.favorPathExtension(false)
					.favorParameter(true)
					.ignoreAcceptHeader(false)
					.defaultContentType(MediaType.APPLICATION_JSON);
	}
	
	// @Override
	// public void configureContentNegotiation(ContentNegotiationConfigurer
	// configurer) {
	// configurer.favorPathExtension(false)
	// .favorParameter(true)
	// .ignoreAcceptHeader(false);
	// }
}
