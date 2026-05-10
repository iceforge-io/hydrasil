package org.iceforge.hydrasil.server;

import org.iceforge.hydrasil.core.ReplicationPlan;
import org.iceforge.hydrasil.runtime.ReplicationRunService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/replication")
class ReplicationController {
    private final ReplicationRunService runService;

    ReplicationController(ReplicationRunService runService) {
        this.runService = runService;
    }

    @PostMapping("/plan")
    ReplicationPlan plan(@RequestBody PlanRequest request) {
        return runService.planRun(request.sourceRoot());
    }

    record PlanRequest(String sourceRoot) { }
}
