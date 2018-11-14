package com.ronnie.cloud.Interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/11/14$ 13:52$
 * @Remark:
 */
@Component
public class OauthTokenInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String oauthToken = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader("oauthToken");
        requestTemplate.header("oauthToken", oauthToken);
    }
}
