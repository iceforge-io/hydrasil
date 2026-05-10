package org.iceforge.hydrasil.lineage;

import java.time.Instant;

public record LineageEvent(String runId, String objectKey, String contentHash, String targetTable, Instant occurredAt) { }
