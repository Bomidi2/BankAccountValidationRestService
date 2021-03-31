package com.provider.model;


public class ServiceResponseEntity {

    private final String provider;
    private final boolean isValid;

    public String  getProvider() {
        return provider;
    }
    public boolean isValid() {
        return isValid;
    }

    public ServiceResponseEntity(String provider, boolean isValid) {
        this.provider = provider;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "{" +
                "provider=" + provider +
                ", isValid=" + isValid +
                '}';
    }
}
