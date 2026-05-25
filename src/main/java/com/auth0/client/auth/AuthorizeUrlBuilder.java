package com.auth0.client.auth;

import static com.auth0.utils.Asserts.assertNotNull;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/**
 * Class that provides the methods to generate a valid Auth0 Authorize Url. It's based on the https://auth0.com/docs/api/authentication#social docs.
 * <p>
 * This class is not thread-safe:
 * It makes use of {@link HashMap} for storing the parameters. Make sure to not call the builder methods
 * from a different or un-synchronized thread.
 */
@SuppressWarnings("WeakerAccess")
public class AuthorizeUrlBuilder {

    private final HttpUrl.Builder builder;

    private final Map<String, String> parameters;

    /**
     * Creates an instance of the {@link AuthorizeUrlBuilder} using the given domain and base parameters.
     *
     * @param baseUrl     the base url constructed from a valid domain.
     * @param clientId    the application's client_id value to set
     * @param redirectUri the redirect_uri value to set. Your Auth0 application must have this URL as one of its Allowed
     *                    Callback URLs.
     * @return a new instance of the {@link AuthorizeUrlBuilder} to configure.
     */
    static AuthorizeUrlBuilder newInstance(HttpUrl baseUrl, String clientId, String redirectUri) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private AuthorizeUrlBuilder(HttpUrl url, String clientId, String redirectUri) {
        assertNotNull(url, "base url");
        assertNotNull(clientId, "client id");
        assertNotNull(redirectUri, "redirect uri");
        parameters = new HashMap<>();
        builder = url.newBuilder().addPathSegment("authorize").addEncodedQueryParameter("redirect_uri", redirectUri).addQueryParameter("client_id", clientId);
        withParameter("response_type", "code");
    }

    /**
     * Sets the connection value.
     *
     * @param connection connection to set
     * @return the builder instance
     */
    public AuthorizeUrlBuilder withConnection(String connection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the audience value.
     *
     * @param audience audience to set
     * @return the builder instance
     */
    public AuthorizeUrlBuilder withAudience(String audience) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the state value.
     *
     * @param state state to set
     * @return the builder instance
     */
    public AuthorizeUrlBuilder withState(String state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the scope value.
     *
     * @param scope scope to set
     * @return the builder instance
     */
    public AuthorizeUrlBuilder withScope(String scope) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the response type value.
     *
     * @param responseType response type to set
     * @return the builder instance
     */
    public AuthorizeUrlBuilder withResponseType(String responseType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the organization query string parameter value used to login to an organization.
     *
     * @param organization The ID or name of the organization to log the user in to.
     * @return the builder instance.
     */
    public AuthorizeUrlBuilder withOrganization(String organization) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the invitation query string parameter to join an organization. If using this, you must also specify the
     * organization using {@linkplain AuthorizeUrlBuilder#withOrganization(String)}.
     *
     * @param invitation The ID of the invitation to accept. This is available on the URL that is provided when accepting an invitation.
     * @return the builder instance.
     */
    public AuthorizeUrlBuilder withInvitation(String invitation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets an additional parameter.
     *
     * @param name  name of the parameter
     * @param value value of the parameter to set
     * @return the builder instance
     */
    public AuthorizeUrlBuilder withParameter(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the {@code code_challenge} parameter used when using the Authorization Code Flow with Proof of Code Exchange (PKCE).
     *
     * @param challenge the generated challenge from a {@code code_verifier}
     * @return the builder instance.
     *
     * @see <a href="https://auth0.com/docs/api/authentication#authorization-code-flow-with-pkce">Authentication API docuementation</a>
     * @see <a href="https://auth0.com/docs/get-started/authentication-and-authorization-flow/add-login-using-the-authorization-code-flow-with-pkce">Authorization Code Flow with Proof of Code Exchange (PKCE)</a>
     */
    public AuthorizeUrlBuilder withCodeChallenge(String challenge) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a string representation of the URL with the configured parameters.
     *
     * @return the string URL
     */
    public String build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
