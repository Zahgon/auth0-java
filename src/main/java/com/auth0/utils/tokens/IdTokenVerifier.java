package com.auth0.utils.tokens;

import com.auth0.exception.IdTokenValidationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.utils.Asserts;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Provides utility methods for validating an OIDC-compliant ID token.
 * See the <a href="https://openid.net/specs/openid-connect-core-1_0-final.html#IDTokenValidation">OIDC Specification</a> for more information.
 * <p>
 * This class is not thread-safe:
 * It makes use of {@link Date} and {@link Calendar} classes to verify time sensitive claims.
 */
public final class IdTokenVerifier {

    // 1 min = 60 sec
    private static final Integer DEFAULT_LEEWAY = 60;

    private static final String NONCE_CLAIM = "nonce";

    private static final String AZP_CLAIM = "azp";

    private static final String AUTH_TIME_CLAIM = "auth_time";

    private final String issuer;

    private final String audience;

    private final Integer leeway;

    private final Date clock;

    private final SignatureVerifier signatureVerifier;

    private final String organization;

    private IdTokenVerifier(Builder builder) {
        this.issuer = builder.issuer;
        this.audience = builder.audience;
        this.leeway = builder.leeway;
        this.signatureVerifier = builder.signatureVerifier;
        this.clock = builder.clock;
        this.organization = builder.organization;
    }

    /**
     * Initialize an instance of {@code IdTokenVerifier}.
     *
     * @param issuer            the expected issuer of the token. Must not be null.
     * @param audience          the expected audience of the token. Must not be null.
     * @param signatureVerifier the {@code SignatureVerifier} to use when verifying the token. Must not be null.
     * @return a {@linkplain Builder} for further configuration.
     */
    public static Builder init(String issuer, String audience, SignatureVerifier signatureVerifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Verifies a provided ID Token follows the <a href="https://openid.net/specs/openid-connect-core-1_0-final.html#IDTokenValidation">OIDC specification.</a>
     *
     * @param token the ID Token to verify. Must not be null or empty.
     * @throws IdTokenValidationException if:
     *                                    <ul>
     *                                        <li>The ID token is null</li>
     *                                        <li>The ID token's signing algorithm is not supported</li>
     *                                        <li>The ID token's signature is invalid</li>
     *                                        <li>Any of the ID token's claims are invalid</li>
     *                                    </ul>
     * @see IdTokenVerifier#verify(String, String)
     * @see IdTokenVerifier#verify(String, String, Integer)
     */
    public void verify(String token) throws IdTokenValidationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Verifies a provided ID Token follows the <a href="https://openid.net/specs/openid-connect-core-1_0-final.html#IDTokenValidation">OIDC specification.</a>
     *
     * @param token the ID Token to verify.
     * @param nonce the nonce expected on the ID token, which must match the nonce specified on the authorization request.
     *              If null, no validation of the nonce will occur.
     * @throws IdTokenValidationException if:
     *                                    <ul>
     *                                        <li>The ID token is null</li>
     *                                        <li>The ID token's signing algorithm is not supported</li>
     *                                        <li>The ID token's signature is invalid</li>
     *                                        <li>Any of the ID token's claims are invalid</li>
     *                                    </ul>
     * @see IdTokenVerifier#verify(String)
     * @see IdTokenVerifier#verify(String, String, Integer)
     */
    public void verify(String token, String nonce) throws IdTokenValidationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Verifies a provided ID Token follows the <a href="https://openid.net/specs/openid-connect-core-1_0-final.html#IDTokenValidation">OIDC specification.</a>
     *
     * @param token                the ID Token to verify. Must not be null or empty.
     * @param nonce                the nonce expected on the ID token, which must match the nonce specified on the authorization request.
     *                             If null, no validation of the nonce will occur.
     * @param maxAuthenticationAge The maximum authentication age allowed, which specifies the allowable elapsed time in seconds
     *                             since the last time the end-user was actively authenticated. This must match the specified
     *                             {@code max_age} parameter specified on the authorization request. If null, no validation
     *                             of the {@code auth_time} claim will occur.
     * @throws IdTokenValidationException if:
     *                                    <ul>
     *                                        <li>The ID token is null</li>
     *                                        <li>The ID token's signing algorithm is not supported</li>
     *                                        <li>The ID token's signature is invalid</li>
     *                                        <li>Any of the ID token's claims are invalid</li>
     *                                    </ul>
     * @see IdTokenVerifier#verify(String)
     * @see IdTokenVerifier#verify(String, String)
     */
    public void verify(String token, String nonce, Integer maxAuthenticationAge) throws IdTokenValidationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }

    /**
     * Builder class to construct a {@linkplain IdTokenVerifier}
     */
    public static class Builder {

        private final String issuer;

        private final String audience;

        private final SignatureVerifier signatureVerifier;

        private Integer leeway;

        private Date clock;

        private String organization;

        /**
         * Create a new Builder instance.
         *
         * @param issuer            the expected issuer of the token. Must not be null.
         * @param audience          the expected audience of the token. Must not be null.
         * @param signatureVerifier the {@code SignatureVerifier} to use when verifying the token. Must not be null.
         */
        private Builder(String issuer, String audience, SignatureVerifier signatureVerifier) {
            Asserts.assertNotNull(issuer, "issuer");
            Asserts.assertNotNull(audience, "audience");
            Asserts.assertNotNull(signatureVerifier, "signatureVerifier");
            this.issuer = issuer;
            this.audience = audience;
            this.signatureVerifier = signatureVerifier;
        }

        /**
         * Specify a custom leeway when validating time-based claims such as {@code exp} and {@code auth_time}.
         * If not specified, a default leeway of 60 seconds will be used.
         *
         * @param leeway the custom leeway to use when validating time-based claims, in seconds.
         * @return this Builder instance.
         */
        public Builder withLeeway(Integer leeway) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Specify the expected organization (org_id) the token must be issued for. This should be used if using the
         * Organizations feature.
         *
         * @param organization the ID of the organization.
         * @return this Builder instance.
         */
        public Builder withOrganization(String organization) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Specify a custom clock to use as the current time when validating time-based claims. Exposed for testing
         * purposes only.
         *
         * @param clock the clock to use as the current time.
         * @return this Builder instance.
         */
        Builder withClock(Date clock) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Constructs an {@linkplain IdTokenVerifier} instance from this Builder.
         *
         * @return an initialized instance of {@code IdTokenVerifier}.
         */
        public IdTokenVerifier build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
