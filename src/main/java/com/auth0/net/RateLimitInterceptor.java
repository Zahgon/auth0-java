package com.auth0.net;

import com.auth0.exception.Auth0Exception;
import com.auth0.net.client.DefaultHttpClient;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.FailsafeException;
import net.jodah.failsafe.RetryPolicy;
import net.jodah.failsafe.event.ExecutionAttemptedEvent;
import net.jodah.failsafe.function.CheckedConsumer;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/**
 * An OkHttp {@linkplain Interceptor} responsible for retrying rate-limit errors (429) using a configurable maximum
 * number of retries, and an exponential backoff on retry attempts.
 * <p>
 * <strong>Note: This class is not intended for general use or extension, and may change at any time.</strong>
 * </p>
 * @see DefaultHttpClient
 */
public class RateLimitInterceptor implements Interceptor {

    private final int maxRetries;

    private final CheckedConsumer<? extends ExecutionAttemptedEvent<Response>> retryListener;

    static final Long INITIAL_INTERVAL = 100L;

    static final Long MAX_INTERVAL = 1000L;

    static final Double JITTER = 0.2D;

    /**
     * Constructs a new instance with the maximum number of allowed retries.
     * @param maxRetries the maximum number of consecutive retries to attempt.
     */
    public RateLimitInterceptor(int maxRetries) {
        this(maxRetries, null);
    }

    /**
     * Visible for testing purposes only.
     * @param maxRetries the maximum number of consecutive retries to attempt.
     * @param retryListener a listener to call prior to a retry attempt.
     */
    RateLimitInterceptor(int maxRetries, CheckedConsumer<? extends ExecutionAttemptedEvent<Response>> retryListener) {
        this.maxRetries = maxRetries;
        this.retryListener = retryListener;
    }

    /**
     * @return the configured number of maximum retries.
     */
    public int getMaxRetries() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
