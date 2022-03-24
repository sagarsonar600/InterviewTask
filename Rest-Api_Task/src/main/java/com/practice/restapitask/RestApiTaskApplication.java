package com.practice.restapitask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.DelegatingFilterProxy;

@SpringBootApplication
public class RestApiTaskApplication {

	@Bean
	public FilterRegistrationBean securityFilterChainRegistration() {
		DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
		delegatingFilterProxy.setTargetBeanName(AbstractSecurityWebApplicationInitializer.DEFAULT_FILTER_NAME);
		FilterRegistrationBean registrationBean = new FilterRegistrationBean(delegatingFilterProxy);
		registrationBean.setName(AbstractSecurityWebApplicationInitializer.DEFAULT_FILTER_NAME);
		registrationBean.addUrlPatterns("/*");
		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(RestApiTaskApplication.class, args);
	}

}
