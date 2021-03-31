package com.provider.service;

import com.provider.model.ProviderRequestModel;
import com.provider.model.ProviderResponseEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class ProviderRestClient implements ProviderRestService {

    private final WebClient webClient;

    public ProviderRestClient(@Value("${content-service}") String baseURL) {
        this.webClient = WebClient.builder().baseUrl(baseURL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, String.valueOf(MediaType.APPLICATION_JSON))
                .build();
    }

    @Override
    public Mono<ProviderResponseEntity> validateBankAccountProvider1(ProviderRequestModel providerRequestModel) {
        return webClient.post()
                .uri("http://localhost:8080/v1/api/account/validate")
                .syncBody(providerRequestModel).retrieve().bodyToMono(ProviderResponseEntity.class);
    }

    @Override
    public Mono<ProviderResponseEntity> validateBankAccountProvider2(ProviderRequestModel providerRequestModel) {
        return webClient.post()
                .uri("http://localhost:8080/v2/api/account/validate")
                .syncBody(providerRequestModel).retrieve().bodyToMono(ProviderResponseEntity.class);
    }



}
