package com.auth0.net;

import com.auth0.client.mgmt.TokenProvider;
import com.auth0.exception.APIException;
import com.auth0.exception.Auth0Exception;
import com.auth0.exception.RateLimitException;
import com.auth0.json.ObjectMapperProvider;
import com.auth0.net.client.*;
import com.auth0.utils.HttpResponseHeadersUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * A request class that is able to interact fluently with the Auth0 server.
 * The default content type of this request is "application/json".
 * <p>
 * This class is not thread-safe:
 * It makes use of {@link HashMap} for storing the parameters. Make sure to not modify headers or the parameters
 * from a different or un-synchronized thread.
 *
 * @param <T> The type expected to be received as part of the response.
 */
public class BaseRequest<T> implements Request<T> {

    private static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";

    private final String url;

    private final HttpMethod method;

    private final ObjectMapper mapper;

    private final Map<String, String> headers;

    private final TypeReference<T> tType;

    private final Map<String, Object> parameters;

    private Object body;

    private static final int STATUS_CODE_TOO_MANY_REQUEST = 429;

    private final Auth0HttpClient client;

    private final TokenProvider tokenProvider;

    BaseRequest(Auth0HttpClient client, TokenProvider tokenProvider, String url, HttpMethod method, ObjectMapper mapper, TypeReference<T> tType) {
        this.client = client;
        this.tokenProvider = tokenProvider;
        this.url = url;
        this.method = method;
        this.mapper = mapper;
        this.headers = new HashMap<>();
        this.tType = tType;
        this.parameters = new HashMap<>();
    }

    public BaseRequest(Auth0HttpClient client, TokenProvider tokenProvider, String url, HttpMethod method, TypeReference<T> tType) {
        this(client, tokenProvider, url, method, ObjectMapperProvider.getMapper(), tType);
    }

    protected Auth0HttpRequest createRequest(String apiToken) throws Auth0Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected T parseResponseBody(Auth0HttpResponse response) throws Auth0Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Responsible for creating the payload that will be set as body on this request.
     *
     * @return the body to send as part of the request.
     * @throws IOException if an error is raised during the creation of the body.
     */
    @SuppressWarnings("deprecation")
    protected HttpRequestBody createRequestBody() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Responsible for parsing the payload that is received as part of the response.
     *
     * @param response the received response. The body buffer will automatically closed.
     * @return the instance of type T, result of interpreting the payload.
     * @throws IOException if an error is raised during the parsing of the body.
     */
    protected T readResponseBody(Auth0HttpResponse response) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Map<String, Object> getParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Executes this request.
     *
     * @return the response body JSON decoded as T
     * @throws Auth0Exception if the request execution fails.
     */
    @Override
    public Response<T> execute() throws Auth0Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public CompletableFuture<Response<T>> executeAsync() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private CompletableFuture<Response<T>> getResponseFuture(Auth0HttpResponse httpResponse) {
        CompletableFuture<Response<T>> future = new CompletableFuture<>();
        try {
            T body = parseResponseBody(httpResponse);
            future = CompletableFuture.completedFuture(new ResponseImpl<>(httpResponse.getHeaders(), body, httpResponse.getCode()));
        } catch (Auth0Exception e) {
            future.completeExceptionally(e);
            return future;
        }
        return future;
    }

    /**
     * Getter for the content-type header value to use on this request
     *
     * @return the content-type
     */
    protected String getContentType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Responsible for parsing an unsuccessful request (status code other than 200)
     * and generating a developer-friendly exception with the error details.
     *
     * @param response the unsuccessful response, as received. If its body is accessed, the buffer must be closed.
     * @return the exception with the error details.
     */
    protected Auth0Exception createResponseException(Auth0HttpResponse response) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private RateLimitException createRateLimitException(Auth0HttpResponse response) {
        // -1 as default value if the header could not be found.
        long limit = Long.parseLong(response.getHeader("x-ratelimit-limit", "-1"));
        long remaining = Long.parseLong(response.getHeader("x-ratelimit-remaining", "-1"));
        long reset = Long.parseLong(response.getHeader("x-ratelimit-reset", "-1"));
        TokenQuotaBucket clientQuotaLimit = HttpResponseHeadersUtils.getClientQuotaLimit(response.getHeaders());
        TokenQuotaBucket organizationQuotaLimit = HttpResponseHeadersUtils.getOrganizationQuotaLimit(response.getHeaders());
        long retryAfter = Long.parseLong(response.getHeader("retry-after", "-1"));
        String payload = response.getBody();
        MapType mapType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Object.class);
        try {
            Map<String, Object> values = mapper.readValue(payload, mapType);
            RateLimitException.Builder builder = new RateLimitException.Builder(limit, remaining, reset, values);
            builder.clientQuotaLimit(clientQuotaLimit);
            builder.organizationQuotaLimit(organizationQuotaLimit);
            builder.retryAfter(retryAfter);
            return builder.build();
        } catch (IOException e) {
            RateLimitException.Builder builder = new RateLimitException.Builder(limit, remaining, reset);
            builder.clientQuotaLimit(clientQuotaLimit);
            builder.organizationQuotaLimit(organizationQuotaLimit);
            builder.retryAfter(retryAfter);
            return builder.build();
        }
    }

    /**
     * Adds an HTTP header to the request
     *
     * @param name  the name of the header
     * @param value the value of the header
     * @return this same request instance
     */
    public BaseRequest<T> addHeader(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BaseRequest<T> addParameter(String name, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BaseRequest<T> setBody(Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
