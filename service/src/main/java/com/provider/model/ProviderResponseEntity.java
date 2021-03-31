package com.provider.model;

import lombok.NoArgsConstructor;
@NoArgsConstructor
public class ProviderResponseEntity {

    private boolean isValid;

    public boolean isValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "ProviderResponseEntity{" +
                "isValid=" + isValid +
                '}';
    }

}
