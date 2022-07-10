package com.ssh.web.model;

import lombok.Data;

@Data
public class RemoteServer {
    private String ip;
    private int port;
    private String username;
    private String password;
}
