package com.rest.provider.controller;

import com.rest.provider.ProviderRequestEntity;
import com.rest.provider.ProviderResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderRestController {


    @PostMapping(path = "/v1/api/account/validate", consumes = "application/json", produces = "application/json")
    public ProviderResponseEntity provider1ValidationRequest(@RequestBody ProviderRequestEntity providerRequestEntity) {
        return new ProviderResponseEntity(true);
    }

    @PostMapping(path = "/v2/api/account/validate", consumes = "application/json", produces = "application/json")
    public ProviderResponseEntity provider2ValidationRequest(@RequestBody ProviderRequestEntity providerRequestEntity) {
        return new ProviderResponseEntity(false);
    }

}
