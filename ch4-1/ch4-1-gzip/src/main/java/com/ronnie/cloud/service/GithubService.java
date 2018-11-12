package com.ronnie.cloud.service;

import com.ronnie.cloud.config.GithubFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/12$ 14:02$
 * @Remark:
 */
@FeignClient(name = "github", url = "https://api.github.com", configuration = GithubFeignConfig.class)
public interface GithubService {
    @GetMapping(value = "/search/repositories")
    ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);
}
