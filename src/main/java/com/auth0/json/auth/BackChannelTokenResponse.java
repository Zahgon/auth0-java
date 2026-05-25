package com.auth0.json.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BackChannelTokenResponse {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("id_token")
    private String idToken;

    @JsonProperty("expires_in")
    private long expiresIn;

    @JsonProperty("scope")
    private String scope;

    public String getAccessToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getIdToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long getExpiresIn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getScope() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
