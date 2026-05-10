# Hydrasil AI Development Instructions

You are working in the Ice Forge Hydrasil repository.

Hydrasil is a Spring Boot / Maven multi-module platform for replicating high-volume Python object-store databases into Databricks Lakehouse datasets.

## Non-negotiables

- Preserve Maven groupId `org.iceforge.hydrasil`.
- Preserve Java package root `org.iceforge.hydrasil`.
- Keep `hydrasil-core` free of Spring Boot dependencies.
- Put design decisions in `ai/adr`.
- Put open design questions in `ai/dqr`.
- Do not bypass idempotency, checkpointing, lineage, or reconciliation concerns for ingestion work.
- Prefer small PRs tied to one GitHub issue/story.

## POC Acceptance Criteria

- Representative source object-store database can be discovered.
- Objects are partition-planned for concurrent replication.
- Bronze target records preserve object identity, content hash, and source metadata.
- Silver target records are generated through a schema contract/inference boundary.
- Reruns are idempotent.
- Failed runs restart from checkpoint.
- Reconciliation reports object counts and row counts.
