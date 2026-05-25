package com.auth0.net;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * OkHttp Interceptor implementation that adds the auth0-client header
 * to every request made by this SDK.
 *
 * @see Interceptor
 */
public class TelemetryInterceptor implements Interceptor {

    private Telemetry telemetry;

    private boolean enabled;

    public TelemetryInterceptor() {
        this(new Telemetry("auth0-java", Telemetry.class.getPackage().getImplementationVersion()));
    }

    TelemetryInterceptor(Telemetry telemetry) {
        this.telemetry = telemetry;
        this.enabled = true;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTelemetry(Telemetry telemetry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Telemetry getTelemetry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEnabled(boolean enabled) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnabled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
