package com.provider.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ProviderEntity {

    private String sortCode;
    private String accountNumber;
    private List<String> providers;

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<String> getProviders() {
        return providers;
    }
}
