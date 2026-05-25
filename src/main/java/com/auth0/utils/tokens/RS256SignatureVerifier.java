package com.auth0.utils.tokens;

import com.auth0.exception.IdTokenValidationException;
import com.auth0.exception.PublicKeyProviderException;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.RSAKeyProvider;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * An implementation of {@code SignatureVerifier} for tokens signed with the RS256 asymmetric signing algorithm.
 * <p>
 * This class is thread-safe.
 */
class RS256SignatureVerifier extends SignatureVerifier {

    RS256SignatureVerifier(PublicKeyProvider publicKeyProvider) {
        super(getAlgorithm(publicKeyProvider));
    }

    private static Algorithm getAlgorithm(final PublicKeyProvider publicKeyProvider) {
        return Algorithm.RSA256(new RSAKeyProvider() {

            @Override
            public RSAPublicKey getPublicKeyById(String keyId) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }

            @Override
            public RSAPrivateKey getPrivateKey() {
                throw new UnsupportedOperationException("STUB: not implemented");
            }

            @Override
            public String getPrivateKeyId() {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
    }
}
