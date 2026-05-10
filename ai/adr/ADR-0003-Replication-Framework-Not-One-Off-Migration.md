# ADR-0003: Treat Hydrasil as a Replication Framework, Not a One-Off Migration

## Status
Proposed

## Context
The source estate contains a series of Python object-store databases. A script-per-source approach would become brittle and hard to govern.

## Decision
Hydrasil will be designed as a reusable replication framework with source contracts, checkpointing, lineage, schema handling, and pluggable Databricks publication.

## Consequences
The initial implementation takes slightly longer than a script, but creates a foundation that can scale across many source databases.
