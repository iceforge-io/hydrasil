package org.iceforge.hydrasil.dbx;

public record DeltaWriteRequest(String targetTable, String sourcePath, String runId) { }
