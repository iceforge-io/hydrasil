package org.iceforge.hydrasil.ingest;

import org.iceforge.hydrasil.core.ReplicationPlan;

public interface SourceDiscoveryService {
    ReplicationPlan discover(String runId, String sourceRoot);
}
