package com.auth0.net;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenQuotaLimit {

    private int quota;

    private int remaining;

    private int resetAfter;

    public TokenQuotaLimit(int quota, int remaining, int resetAfter) {
        this.quota = quota;
        this.remaining = remaining;
        this.resetAfter = resetAfter;
    }

    public int getQuota() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getRemaining() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getResetAfter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
