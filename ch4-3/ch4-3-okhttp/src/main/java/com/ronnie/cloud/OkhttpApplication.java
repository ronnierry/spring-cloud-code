package com.ronnie.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/12$ 11:13$
 * @Remark:
 */
@EnableFeignClients
@SpringBootApplication
public class OkhttpApplication {
    public static void main(String[] args) {
        SpringApplication.run(OkhttpApplication.class, args);
    }
}
