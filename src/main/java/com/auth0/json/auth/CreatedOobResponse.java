package com.auth0.json.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedOobResponse {

    @JsonProperty("oob_code")
    private String oobCode;

    @JsonProperty("barcode_uri")
    private String barcodeUri;

    @JsonProperty("authenticator_type")
    private String authenticatorType;

    @JsonProperty("oob_channel")
    private String oobChannel;

    @JsonProperty("recovery_codes")
    private List<String> recoveryCodes;

    public String getOobCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getBarcodeUri() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAuthenticatorType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getRecoveryCodes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOobChannel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
