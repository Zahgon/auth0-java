package com.auth0.net.client;

import com.auth0.utils.Asserts;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Auth0MultipartRequestBody {

    private final FilePart filePart;

    private final Map<String, String> parts;

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Auth0MultipartRequestBody(Builder builder) {
        this.filePart = builder.filePart;
        this.parts = new HashMap<>(builder.parts);
    }

    public FilePart getFilePart() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getParts() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class FilePart {

        private final String partName;

        private final File file;

        private final String mediaType;

        public FilePart(String partName, File file, String mediaType) {
            Asserts.assertNotNull(partName, "part name");
            Asserts.assertNotNull(file, "file");
            Asserts.assertNotNull(mediaType, "mediaType");
            this.partName = partName;
            this.file = file;
            this.mediaType = mediaType;
        }

        public String getPartName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public File getFile() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getMediaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class Builder {

        FilePart filePart;

        Map<String, String> parts = new HashMap<>();

        private Builder() {
        }

        public Builder withFilePart(FilePart filePart) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder withPart(String name, String value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Auth0MultipartRequestBody build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
