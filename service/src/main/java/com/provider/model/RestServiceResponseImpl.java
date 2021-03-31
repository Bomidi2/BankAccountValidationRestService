package com.provider.model;


import org.json.JSONArray;
import org.json.JSONObject;
import reactor.core.publisher.Mono;

public class RestServiceResponseImpl {

    public static JSONObject aggregateResponse(
            Mono<ProviderResponseEntity> isValid1,
            Mono<com.provider.model.ProviderResponseEntity> isValid2, String providerName1, String providerName2){
        JSONObject response = new JSONObject();
        JSONObject innerElements1 = new JSONObject();
        JSONObject innerElements2 = new JSONObject();
        JSONArray elementsArray = new JSONArray();

        innerElements1.put("provider", providerName1);
        innerElements1.put("isValid", isValid1);
        innerElements2.put("provider", providerName2);
        innerElements2.put("isValid", isValid2);

        elementsArray.put(innerElements1);
        elementsArray.put(innerElements2);
        response.put("result", elementsArray);

        return response;
    }

//    public static void main(String[] args) {
//        System.out.println(aggregateResponse(true, false, "provider1", "provider2"));
//    }
}
