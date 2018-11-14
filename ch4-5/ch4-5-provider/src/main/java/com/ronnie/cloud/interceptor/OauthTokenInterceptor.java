package com.ronnie.cloud.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/14$ 13:57$
 * @Remark:
 */

public class OauthTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String oauthToken = request.getHeader("oauthToken");
        System.out.println("oauthToken : " + oauthToken);
        return true;
    }
}
