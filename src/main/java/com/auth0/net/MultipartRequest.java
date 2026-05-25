package com.auth0.net;

import static com.auth0.utils.Asserts.assertNotNull;
import com.auth0.client.mgmt.TokenProvider;
import com.auth0.json.ObjectMapperProvider;
import com.auth0.net.client.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;

/**
 * Request class that accepts parts to be sent encoded in a form.
 * The content type of this request is "multipart/form-data".
 * <p>
 * This class is not thread-safe:
 * It makes use of {@link HashMap} for storing the parameters. Make sure to not modify headers or the parameters
 * from a different or un-synchronized thread.
 *
 * @param <T> The type expected to be received as part of the response.
 * @see BaseRequest
 */
public class MultipartRequest<T> extends BaseRequest<T> {

    private static final String CONTENT_TYPE_FORM_DATA = "multipart/form-data";

    private final Auth0MultipartRequestBody.Builder bodyBuilder;

    private final TypeReference<T> tType;

    private final ObjectMapper mapper;

    private int partsCount;

    MultipartRequest(Auth0HttpClient client, TokenProvider tokenProvider, String url, HttpMethod method, ObjectMapper mapper, TypeReference<T> tType) {
        super(client, tokenProvider, url, method, mapper, tType);
        if (HttpMethod.GET.equals(method)) {
            throw new IllegalArgumentException("Multipart/form-data requests do not support the GET method.");
        }
        this.mapper = mapper;
        this.tType = tType;
        this.bodyBuilder = Auth0MultipartRequestBody.newBuilder();
    }

    public MultipartRequest(Auth0HttpClient client, TokenProvider tokenProvider, String url, HttpMethod method, TypeReference<T> tType) {
        this(client, tokenProvider, url, method, ObjectMapperProvider.getMapper(), tType);
    }

    @Override
    protected String getContentType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected HttpRequestBody createRequestBody() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected T readResponseBody(Auth0HttpResponse response) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public MultipartRequest<T> addHeader(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds a key-value part to the form of this request
     *
     * @param name  the name of the part
     * @param value the value of the part
     * @return this same request instance
     */
    public MultipartRequest<T> addPart(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
