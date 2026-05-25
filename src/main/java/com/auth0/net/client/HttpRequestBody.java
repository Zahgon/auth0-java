package com.auth0.net.client;

public class HttpRequestBody {

    private byte[] content;

    private String contentType;

    private Auth0MultipartRequestBody multipartRequestBody;

    private Auth0FormRequestBody formRequestBody;

    public static HttpRequestBody create(String contentType, byte[] content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static HttpRequestBody create(String contentType, Auth0MultipartRequestBody multipartRequestBody) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static HttpRequestBody create(String contentType, Auth0FormRequestBody formRequestBody) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Auth0MultipartRequestBody getMultipartRequestBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Auth0FormRequestBody getFormRequestBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getContentType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private HttpRequestBody(String contentType, byte[] content) {
        this.contentType = contentType;
        this.content = content;
    }

    private HttpRequestBody(String contentType, Auth0MultipartRequestBody multipartRequestBody) {
        this.contentType = contentType;
        this.multipartRequestBody = multipartRequestBody;
    }

    private HttpRequestBody(String contentType, Auth0FormRequestBody formRequestBody) {
        this.contentType = contentType;
        this.formRequestBody = formRequestBody;
    }
}
