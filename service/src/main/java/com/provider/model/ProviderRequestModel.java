package com.provider.model;

public class ProviderRequestModel {

    public ProviderRequestModel(String sortCode, String accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private String sortCode;
    private String accountNumber;
}
