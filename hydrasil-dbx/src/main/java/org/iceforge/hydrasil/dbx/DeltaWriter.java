package org.iceforge.hydrasil.dbx;

public interface DeltaWriter {
    void writeBronze(DeltaWriteRequest request);
    void writeSilver(DeltaWriteRequest request);
}
