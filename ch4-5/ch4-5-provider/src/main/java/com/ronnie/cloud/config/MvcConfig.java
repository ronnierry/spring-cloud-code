package com.ronnie.cloud.config;

import com.ronnie.cloud.interceptor.OauthTokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/14$ 14:02$
 * @Remark:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OauthTokenInterceptor())
                .addPathPatterns("/**");
    }
}
