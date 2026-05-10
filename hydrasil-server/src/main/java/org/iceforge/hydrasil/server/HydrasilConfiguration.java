package org.iceforge.hydrasil.server;

import org.iceforge.hydrasil.ingest.PrefixPartitioningDiscoveryService;
import org.iceforge.hydrasil.ingest.SourceDiscoveryService;
import org.iceforge.hydrasil.runtime.ReplicationRunService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HydrasilConfiguration {
    @Bean
    SourceDiscoveryService sourceDiscoveryService() {
        return new PrefixPartitioningDiscoveryService();
    }

    @Bean
    ReplicationRunService replicationRunService(SourceDiscoveryService sourceDiscoveryService) {
        return new ReplicationRunService(sourceDiscoveryService);
    }
}
