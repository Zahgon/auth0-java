package com.auth0.utils;

import com.auth0.net.TokenQuotaBucket;
import com.auth0.net.TokenQuotaLimit;
import java.util.Map;

public class HttpResponseHeadersUtils {

    /**
     * Gets the client token quota limits from the provided headers.
     *
     * @param headers the HTTP response headers.
     * @return a TokenQuotaBucket containing client rate limits, or null if not present.
     */
    public static TokenQuotaBucket getClientQuotaLimit(Map<String, String> headers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Gets the organization token quota limits from the provided headers.
     *
     * @param headers the HTTP response headers.
     * @return a TokenQuotaBucket containing organization rate limits, or null if not present.
     */
    public static TokenQuotaBucket getOrganizationQuotaLimit(Map<String, String> headers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static TokenQuotaBucket parseQuota(String tokenQuota) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
