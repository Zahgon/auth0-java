package com.auth0.client.auth;

import com.auth0.exception.ClientAssertionSigningException;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.utils.Asserts;
import java.security.interfaces.RSAPrivateKey;
import java.time.Instant;
import java.util.UUID;
import org.jetbrains.annotations.TestOnly;

/**
 * An implementation of {@linkplain ClientAssertionSigner} for RSA-signed client assertions.
 */
public class RSAClientAssertionSigner implements ClientAssertionSigner {

    private final RSAPrivateKey assertionSigningKey;

    private final RSASigningAlgorithm assertionSigningAlgorithm;

    /**
     * Creates a new instance.
     *
     * @param assertionSigningKey the private key used to sign the assertion. Must not be null.
     * @param assertionSigningAlgorithm The RSA algorithm used to sign the assertion. Must not be null.
     *
     * @see #RSAClientAssertionSigner(RSAPrivateKey)
     */
    public RSAClientAssertionSigner(RSAPrivateKey assertionSigningKey, RSASigningAlgorithm assertionSigningAlgorithm) {
        Asserts.assertNotNull(assertionSigningKey, "assertion signing key");
        Asserts.assertNotNull(assertionSigningAlgorithm, "assertion signing algorithm");
        this.assertionSigningKey = assertionSigningKey;
        this.assertionSigningAlgorithm = assertionSigningAlgorithm;
    }

    /**
     * Creates a new instance using the RSA256 signing algorithm.
     *
     * @param assertionSigningKey the private key used to sign the assertion. Must not be null.
     *
     * @see #RSAClientAssertionSigner(RSAPrivateKey, RSASigningAlgorithm)
     */
    public RSAClientAssertionSigner(RSAPrivateKey assertionSigningKey) {
        this(assertionSigningKey, RSASigningAlgorithm.RSA256);
    }

    @Override
    public String createSignedClientAssertion(String issuer, String audience, String subject) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the assertion signing algorithm configured.
     */
    @TestOnly
    RSASigningAlgorithm getAssertionSigningAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Represents the RSA algorithms available to sign the client assertion.
     */
    public enum RSASigningAlgorithm {

        /**
         * The RSA 256 algorithm
         */
        RSA256,
        /**
         * The RSA 384 algorithm
         */
        RSA384
    }
}
