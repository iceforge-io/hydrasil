package org.iceforge.hydrasil.core;

import java.time.Instant;
import java.util.Objects;

public record ObjectIdentity(
        String sourceSystem,
        String databaseName,
        String objectKey,
        String versionId,
        String contentHash,
        Instant observedAt
) {
    public ObjectIdentity {
        Objects.requireNonNull(sourceSystem, "sourceSystem");
        Objects.requireNonNull(databaseName, "databaseName");
        Objects.requireNonNull(objectKey, "objectKey");
        Objects.requireNonNull(contentHash, "contentHash");
        Objects.requireNonNull(observedAt, "observedAt");
    }
}
