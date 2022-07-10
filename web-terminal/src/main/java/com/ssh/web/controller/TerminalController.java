package com.ssh.web.controller;

import com.ssh.web.model.RemoteServer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
public class TerminalController {
    private List<RemoteServer> remoteServerList = new ArrayList<>();

    @PostConstruct
    void init() {
        RemoteServer remoteServer = new RemoteServer();
        String ip = "192.168.35.64";
        remoteServer.setIp(ip);
        remoteServer.setPort(5222);
        remoteServer.setUsername("root");
        remoteServer.setPassword("1234");
        remoteServerList.add(remoteServer);
    }

    @GetMapping("/remote-servers")
    public ResponseEntity<Object> get() {
        return ResponseEntity.ok(remoteServerList);
    }

    @PostMapping("/remote-servers")
    public ResponseEntity<Object> addServerInfo(RemoteServer remoteServer) {
        return ResponseEntity.ok()
                .build();
    }
}
