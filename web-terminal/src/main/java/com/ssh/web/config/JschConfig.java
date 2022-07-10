package com.ssh.web.config;

import com.jcraft.jsch.JSch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JschConfig {

    @Bean
    public JSch jSch() {
        return new JSch();
    }
}
