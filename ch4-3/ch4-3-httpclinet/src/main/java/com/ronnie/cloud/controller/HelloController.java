package com.ronnie.cloud.controller;

import com.ronnie.cloud.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/12$ 13:40$
 * @Remark:
 */
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/query")
    public String query(String q) {
        return helloService.searchRepo(q);
    }
}
