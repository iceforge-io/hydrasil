package org.iceforge.hydrasil.runtime;

import org.iceforge.hydrasil.core.ReplicationPlan;
import org.iceforge.hydrasil.ingest.SourceDiscoveryService;
import java.util.UUID;

public class ReplicationRunService {
    private final SourceDiscoveryService discoveryService;

    public ReplicationRunService(SourceDiscoveryService discoveryService) {
        this.discoveryService = discoveryService;
    }

    public ReplicationPlan planRun(String sourceRoot) {
        return discoveryService.discover(UUID.randomUUID().toString(), sourceRoot);
    }
}
