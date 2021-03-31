package com.provider.web;

import com.provider.model.*;
import com.provider.service.ProviderRestClient;
import com.provider.service.ProviderRestService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class ServiceController {

    private ProviderRestService providerRestService;

    public ServiceController(ProviderRestService providerRestService) {
        this.providerRestService = providerRestService;
    }

    @PostMapping(path = "/validate", consumes = "application/json", produces = "application/json")
    public JSONObject serviceResponseEntity(@RequestBody ProviderEntity provider){
        return RestServiceResponseImpl.aggregateResponse((providerRestService.validateBankAccountProvider1(new ProviderRequestModel("123456", "12345678"))),
                (providerRestService.validateBankAccountProvider2(new ProviderRequestModel("123456", "12345678"))),
                provider.getProviders().get(0), provider.getProviders().get(1));
    }

}
