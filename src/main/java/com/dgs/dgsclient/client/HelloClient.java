package com.dgs.dgsclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hello-client", url = "localhost:8080/")
public interface HelloClient {

    @GetMapping(value = "api/v1/hello")
    String getHello();
}
