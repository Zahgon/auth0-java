package com.auth0.client;

import com.auth0.utils.Asserts;
import java.net.Proxy;
import okhttp3.Credentials;

/**
 * Used to configure Java Proxy-related configurations.
 */
public class ProxyOptions {

    private final Proxy proxy;

    private String basicAuth;

    /**
     * Builds a new instance using the given Proxy.
     * The Proxy will not have authentication unless {@link #setBasicAuthentication(String, char[])} is set.
     *
     * @param proxy the Proxy to use.
     */
    public ProxyOptions(Proxy proxy) {
        Asserts.assertNotNull(proxy, "proxy");
        this.proxy = proxy;
    }

    /**
     * Setter that builds the authentication value to use for this Proxy.
     *
     * @param username the username to use.
     * @param password the password to use.
     */
    public void setBasicAuthentication(String username, char[] password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Getter of the Proxy instance to set
     *
     * @return the Proxy instance to set
     */
    public Proxy getProxy() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Getter of the authentication value to use for this Proxy.
     *
     * @return the authentication value to use for this Proxy, or null if unset.
     */
    public String getBasicAuthentication() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
