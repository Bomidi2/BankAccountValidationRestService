package com.provider.service;

import com.provider.model.ProviderRequestModel;
import com.provider.model.ProviderResponseEntity;
import reactor.core.publisher.Mono;

public interface ProviderRestService {
    Mono<ProviderResponseEntity> validateBankAccountProvider1(ProviderRequestModel providerRequestModel);
    Mono<ProviderResponseEntity> validateBankAccountProvider2(ProviderRequestModel providerRequestModel);
}
