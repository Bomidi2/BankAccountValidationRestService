package com.rest.provider;


public class ProviderResponseEntity {

    public boolean isValid() {
        return isValid;
    }

    private final boolean isValid;

    public ProviderResponseEntity(boolean isValid) {
        this.isValid = isValid;
    }
}
