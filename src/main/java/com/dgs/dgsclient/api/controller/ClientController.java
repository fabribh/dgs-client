package com.dgs.dgsclient.api.controller;

import com.dgs.dgsclient.service.ClientService;
import com.dgs.dgsclient.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client/hello")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public Hello getContent() {
        return clientService.getHelloExternal();
    }
}
