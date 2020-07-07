package com.ylw.learn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		InterceptorRegistration tokenInterceptor = registry.addInterceptor(new TokenInterceptor());

		//拦截所有接口
		tokenInterceptor.addPathPatterns("/**");
		//放行测试接口
		tokenInterceptor.excludePathPatterns("/test/**");
		
	}

	
	
}
