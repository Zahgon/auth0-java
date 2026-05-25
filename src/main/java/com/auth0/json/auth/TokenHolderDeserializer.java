package com.auth0.json.auth;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

/**
 * A custom Jackson Deserializer for the {@linkplain TokenHolder} object. It deserializes the JSON response and calculates
 * an {@code expiresAt} date derived from the current time and the {@code expires_at} returned on the response.
 */
public class TokenHolderDeserializer extends StdDeserializer<TokenHolder> {

    @SuppressWarnings("unused")
    public TokenHolderDeserializer() {
        this(null);
    }

    public TokenHolderDeserializer(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public TokenHolder deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
