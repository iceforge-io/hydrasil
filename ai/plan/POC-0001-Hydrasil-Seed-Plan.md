# POC-0001: Hydrasil Seed Plan

## Goal
Build a runnable POC that discovers one representative Hydra-style Python object-store database and produces governed bronze and silver Databricks outputs.

## Phase 1: Source Understanding
- Capture source database contract.
- Identify object identity rules.
- Identify manifest/index availability.
- Identify Python object encoding format.

## Phase 2: Bronze Replication
- Implement object discovery.
- Implement partition planning.
- Implement checkpoint model.
- Write bronze object metadata and raw payload references.
- Record lineage events.

## Phase 3: Silver Structuring
- Decode representative Python objects.
- Infer or apply source schema contract.
- Detect schema drift.
- Write conformed silver tables.

## Phase 4: Reconciliation
- Compare discovered object count, replicated object count, failed object count, and decoded row count.
- Produce reconciliation report per run.
- Support restart after injected failure.

## Phase 5: Scale Test
- Generate or identify millions of representative objects.
- Run concurrent partition ingestion.
- Measure throughput, Databricks write performance, and checkpoint overhead.
