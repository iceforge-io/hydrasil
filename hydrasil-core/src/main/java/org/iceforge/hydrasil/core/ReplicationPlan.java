package org.iceforge.hydrasil.core;

import java.util.List;

public record ReplicationPlan(String runId, List<SourcePartition> partitions) { }
