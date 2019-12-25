package com.config;

import com.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MvcConfig implements WebMvcConfigurer {
    @Bean//产生LoginInterceptor类对象
    public LoginInterceptor getLoginInterceptor() {
        return new LoginInterceptor();
    }

/*    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.getLoginInterceptor()).addPathPatterns("/**");
    }*/
}
