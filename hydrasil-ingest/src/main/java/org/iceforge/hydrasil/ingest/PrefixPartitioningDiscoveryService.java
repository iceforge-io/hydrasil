package org.iceforge.hydrasil.ingest;

import org.iceforge.hydrasil.core.ReplicationPlan;
import org.iceforge.hydrasil.core.SourcePartition;
import java.util.List;

public class PrefixPartitioningDiscoveryService implements SourceDiscoveryService {
    @Override
    public ReplicationPlan discover(String runId, String sourceRoot) {
        return new ReplicationPlan(runId, List.of(
                new SourcePartition("p00", sourceRoot + "/00", 0),
                new SourcePartition("p01", sourceRoot + "/01", 0)
        ));
    }
}
