package com.ssh.web.model;

import com.jcraft.jsch.Channel;
import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

@Data
public class ConnectInfo {
    private Channel channel;
    private WebSocketSession session;

    public boolean isConnected() {
        return this.channel.isConnected();
    }
}
