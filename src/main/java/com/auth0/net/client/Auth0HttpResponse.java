package com.auth0.net.client;

import com.auth0.utils.Asserts;
import java.util.HashMap;
import java.util.Map;

public class Auth0HttpResponse {

    private final int code;

    private final String body;

    private final Map<String, String> headers;

    private Auth0HttpResponse(Builder builder) {
        Asserts.assertNotNull(builder.code, "response code");
        Asserts.assertNotNull(builder.headers, "response headers");
        this.code = builder.code;
        this.body = builder.body;
        this.headers = new HashMap<>(builder.headers);
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSuccessful() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getHeaders() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getHeader(String header) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getHeader(String header, String defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private int code;

        private String body;

        private Map<String, String> headers = new HashMap<>();

        private Builder() {
        }

        public Builder withStatusCode(int code) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder withBody(String body) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder withHeaders(Map<String, String> headers) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Auth0HttpResponse build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
