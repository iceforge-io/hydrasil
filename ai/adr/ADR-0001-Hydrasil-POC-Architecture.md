# ADR-0001: Hydrasil POC Architecture

## Status
Accepted for POC

## Context
Hydrasil replicates high-volume Python object-store databases into Databricks as governed lakehouse datasets. The source ecosystem uses Greek god naming and the source object-store identity is Hydra. Ice Forge systems use a Nordic naming theme.

## Decision
Create Hydrasil as a Spring Boot / Maven multi-module platform with clear separation between source discovery, ingestion, schema handling, Databricks writing, lineage, catalog publication, runtime orchestration, and observability.

## Consequences
- The POC can start simple while preserving clean module boundaries.
- `hydrasil-core` remains dependency-light and does not depend on Spring Boot.
- Databricks-specific code is isolated in `hydrasil-dbx`.
- Replication correctness concerns are first-class from day one.
