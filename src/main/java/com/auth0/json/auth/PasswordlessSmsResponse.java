package com.auth0.json.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the successful response when initiating the passwordless flow via SMS.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordlessSmsResponse {

    @JsonProperty("_id")
    private String id;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("phone_verified")
    private Boolean phoneVerified;

    @JsonProperty("request_language")
    private String requestLanguage;

    /**
     * The Identifier of this request.
     *
     * @return the identifier of this request.
     */
    @JsonProperty("_id")
    public String getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Gets the phone number the code was sent to.
     *
     * @return the phone number the code was sent to.
     */
    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Whether the phone number has been verified (true) or has not been verified (false).
     *
     * @return whether the phone number has been verified (true) or has not been verified (false).
     */
    @JsonProperty("phone_verified")
    public Boolean isPhoneVerified() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The language of the message sent, if set.
     *
     * @return The language of the message sent, or null if not changed from the default.
     */
    @JsonProperty("request_language")
    public String getRequestLanguage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
