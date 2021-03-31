package com.rest.provider;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProviderRequestEntity {

    public ProviderRequestEntity(String sortCode, String accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    private String sortCode;
    private String accountNumber;
}
