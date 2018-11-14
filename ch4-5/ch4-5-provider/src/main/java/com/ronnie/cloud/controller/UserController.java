package com.ronnie.cloud.controller;

import com.ronnie.cloud.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/13$ 10:01$
 * @Remark:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/add")
    public String add(User user) {
        return user.toString() + "provider :add";
    }

    @PostMapping("/update")
    public String update(@RequestBody User user) {
        return user.toString() + "provider :update";
    }
}
