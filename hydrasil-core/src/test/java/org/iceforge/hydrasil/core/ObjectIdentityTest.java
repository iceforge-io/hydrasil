package org.iceforge.hydrasil.core;

import org.junit.jupiter.api.Test;
import java.time.Instant;
import static org.assertj.core.api.Assertions.assertThat;

class ObjectIdentityTest {
    @Test
    void createsIdentity() {
        var identity = new ObjectIdentity("hydra", "risk-db", "a/b/c.pkl", "v1", "abc123", Instant.EPOCH);
        assertThat(identity.sourceSystem()).isEqualTo("hydra");
    }
}
