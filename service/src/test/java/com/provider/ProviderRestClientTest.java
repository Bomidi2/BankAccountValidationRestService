package com.provider;

import com.provider.model.ProviderRequestModel;
import com.provider.model.ProviderResponseEntity;
import com.provider.service.ProviderRestClient;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProviderRestClientTest {

    private final MockWebServer mockWebServer = new MockWebServer();

    private final ProviderRestClient contentServiceImpl = new ProviderRestClient(mockWebServer.url("localhost/").toString());

    @After
    public void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    public void shouldReturnFirstProviderResponse() {
        mockWebServer.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE));
        ProviderResponseEntity response = contentServiceImpl.validateBankAccountProvider1(new ProviderRequestModel("123456", "12345678")).block();
        assertThat(response.isValid(), is(equalTo(false)));;
        System.out.println(response);
    }

    @Test
    public void shouldReturnSecondProviderResponse() {
        mockWebServer.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE));
        ProviderResponseEntity response = contentServiceImpl.validateBankAccountProvider2(new ProviderRequestModel("123456", "12345678")).block();
        assertThat(response.isValid(), is(equalTo(false)));;
        System.out.println(response);
    }


}
