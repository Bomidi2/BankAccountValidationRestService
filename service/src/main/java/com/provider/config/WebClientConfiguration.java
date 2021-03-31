package com.provider.config;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import lombok.var;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebClientConfiguration {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static final int TIMEOUT = 1000;

    @Bean
    public WebClient webClientWithTimeout() {

        return WebClient.builder()
                .baseUrl(BASE_URL)
                .build();
    }
}
