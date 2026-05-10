package org.iceforge.hydrasil.observability;

public record ReplicationProgress(String runId, long objectsDiscovered, long objectsReplicated, long objectsFailed) { }
