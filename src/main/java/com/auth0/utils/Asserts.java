package com.auth0.utils;

import java.util.Collection;
import okhttp3.HttpUrl;

public abstract class Asserts {

    /**
     * Asserts that an object is not null.
     *
     * @param value the value to check.
     * @param name the name of the parameter, used when creating the exception message.
     * @throws IllegalArgumentException if the value is null
     */
    public static void assertNotNull(Object value, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Asserts that a value is a valid URL.
     *
     * @param value the value to check.
     * @param name the name of the parameter, used when creating the exception message.
     * @throws IllegalArgumentException if the value is null or is not a valid URL.
     */
    public static void assertValidUrl(String value, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Asserts that a collection is not null and has at least one item.
     *
     * @param value the value to check.
     * @param name the name of the parameter, used when creating the exception message.
     * @throws IllegalArgumentException if the value is null or has length of zero.
     */
    public static void assertNotEmpty(Collection<?> value, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
