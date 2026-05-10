# DQR-0002: Replication Correctness Semantics

## Question
Is the Databricks target a point-in-time replica, append-only historical record, latest-state mirror, or queryable audit timeline?

## Scope
Define the expected behavior for changed objects, deleted objects, late-arriving objects, reruns, and partial failures.

## Impact
This drives bronze table design, checkpoint strategy, reconciliation, and target merge/append behavior.

## Tie-in
The POC guarantee includes idempotent rerun and restart after failure.

## Risk Summary
Ambiguous correctness semantics will create downstream distrust in silver tables and reconciliation reports.
