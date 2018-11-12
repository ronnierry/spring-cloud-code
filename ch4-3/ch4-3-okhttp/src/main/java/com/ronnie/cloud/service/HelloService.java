package com.ronnie.cloud.service;

import com.ronnie.cloud.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/12$ 13:30$
 * @Remark:
 */
@FeignClient(name = "github-client",url = "https://api.github.com",configuration = HelloFeignServiceConfig.class)
public interface HelloService {
    @GetMapping(value = "/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);
}
