package com.ronnie.cloud.controller;

import com.ronnie.cloud.model.User;
import com.ronnie.cloud.service.UserFeignService;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/13$ 9:56$
 * @Remark:
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserFeignService userFeignService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String test(@RequestBody @ApiParam(value = "用户信息") User user) {
        log.info(user.toString());
        return "hello" + userFeignService.add(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody @ApiParam(value = "用户信息") User user) {
        log.info(user.toString());
        return "hello" + userFeignService.update(user);
    }
}
