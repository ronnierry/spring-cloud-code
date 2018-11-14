package com.ronnie.cloud.service;

import com.ronnie.cloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/13$ 10:06$
 * @Remark:
 */
@FeignClient(name = "ch4-5-provider")
public interface UserFeignService {
    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    String add(User user);

    @PostMapping("/user/update")
    String update(User user);
}
