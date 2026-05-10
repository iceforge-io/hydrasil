package org.iceforge.hydrasil.core;

public record SourcePartition(String partitionId, String prefix, long estimatedObjectCount) { }
