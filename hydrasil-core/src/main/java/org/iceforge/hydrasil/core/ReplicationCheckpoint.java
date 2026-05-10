package org.iceforge.hydrasil.core;

import java.time.Instant;

public record ReplicationCheckpoint(
        String runId,
        String partitionId,
        String lastCompletedObjectKey,
        long completedObjectCount,
        Instant updatedAt
) { }
