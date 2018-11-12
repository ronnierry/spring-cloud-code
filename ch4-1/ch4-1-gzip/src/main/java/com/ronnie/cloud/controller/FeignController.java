package com.ronnie.cloud.controller;

import com.ronnie.cloud.service.GithubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/12$ 14:09$
 * @Remark:
 */
@RestController
public class FeignController {
    @Resource
    private GithubService githubService;

    @GetMapping("/query")
    public ResponseEntity<byte[]> query(String q) {
        return githubService.searchRepo(q);
    }
}
