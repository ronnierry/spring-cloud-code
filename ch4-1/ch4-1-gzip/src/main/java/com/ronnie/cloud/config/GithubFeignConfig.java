package com.ronnie.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/12$ 14:03$
 * @Remark:
 */
@Configuration
public class GithubFeignConfig {
    @Bean
    public Logger.Level fetchLevel() {
        return Logger.Level.FULL;
    }
}
