package com.homedepot.interview.challenge.ouinterviewchallenge.service;

import com.homedepot.interview.challenge.ouinterviewchallenge.entity.CoincapAsset;
import com.homedepot.interview.challenge.ouinterviewchallenge.entity.CryptoExchangeRate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;


@Service
public class CoincapService {

    public CoincapService() {
    }


    public CryptoExchangeRate getCryptoExchangeRate(Double input, String from, String to) {

        // TODO: Implement the necessary logic and calls to
        //  Coincap that might be needed to satisfy requirements.
        return null;
    }


    /**
     * Searches the Coincap API for a token by Symbol name
     * @param tokenSymbol
     * @return a Coincap Asset
     */
    private CoincapAsset findTokenFromSymbolUpstreamCoincapAPI(String tokenSymbol) {

        // TODO: Implement Coincap API service call
        return null;
    }

    /**
     *  Used for Authorization to Coincap since an API key is required.
     *
     */
    private HttpEntity<HttpHeaders> getCoincapHeaders() {

        HttpHeaders headers = new HttpHeaders();
        // TODO: Need to implement logic to pass Authorization token

        headers.add("Accept-Encoding", "deflate");
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
