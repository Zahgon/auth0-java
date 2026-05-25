package com.auth0.net.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Auth0HttpRequest {

    private final String url;

    private final Map<String, String> headers;

    private final HttpRequestBody body;

    private final HttpMethod method;

    public static Builder newBuilder(String url, HttpMethod method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Auth0HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.headers = Objects.nonNull(builder.headers) ? new HashMap<>(builder.headers) : new HashMap<>();
    }

    public String getUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getHeaders() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public HttpRequestBody getBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public HttpMethod getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private final String url;

        private Map<String, String> headers;

        private HttpRequestBody body;

        private final HttpMethod method;

        private Builder(String url, HttpMethod method) {
            this.url = url;
            this.method = method;
        }

        public Builder withHeaders(Map<String, String> headers) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder withBody(HttpRequestBody body) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Auth0HttpRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
