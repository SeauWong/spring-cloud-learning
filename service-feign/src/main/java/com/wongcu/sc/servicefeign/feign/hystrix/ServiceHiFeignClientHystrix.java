package com.wongcu.sc.servicefeign.feign.hystrix;

import com.wongcu.sc.servicefeign.feign.ServiceHiFeignClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiFeignClientHystrix implements ServiceHiFeignClient {
    @Override
    public String hi(String name) {
        return "hi feign error!";
    }
}
