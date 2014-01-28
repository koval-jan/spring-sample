package com.sample.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@ComponentScan({ "osgi.sample.bl.**.repository.impl",
		"osgi.sample.bl.**.application.command" })
public class AppConfig {

	@PreDestroy
	public void destroy() {
	}

	@PostConstruct
	public void init() {

	}

}
