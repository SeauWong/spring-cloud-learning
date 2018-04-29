package com.wongcu.sc.servicefeign.feign;

import com.wongcu.sc.servicefeign.feign.hystrix.ServiceHiFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = ServiceHiFeignClientHystrix.class)
public interface ServiceHiFeignClient {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);
}
