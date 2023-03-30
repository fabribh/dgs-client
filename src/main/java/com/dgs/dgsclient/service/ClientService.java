package com.dgs.dgsclient.service;

import com.dgs.dgsclient.model.Hello;
import com.dgs.dgsclient.client.HelloClient;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final HelloClient client;

    public ClientService(HelloClient client) {
        this.client = client;
    }

    public Hello getHelloExternal() {
        String helloResponse = client.getHello();
        Hello hello = new Hello(helloResponse);
        return hello;
    }
}
