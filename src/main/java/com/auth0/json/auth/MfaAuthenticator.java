package com.auth0.json.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MfaAuthenticator {

    @JsonProperty("id")
    private String id;

    @JsonProperty("authenticator_type")
    private String authenticatorType;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("name")
    private String name;

    @JsonProperty("oob_channel")
    private String oobChannel;

    public String getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAuthenticatorType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isActive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOobChannel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
