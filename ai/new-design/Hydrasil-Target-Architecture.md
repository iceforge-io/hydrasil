# Hydrasil Target Architecture

```mermaid
flowchart LR
    A[Hydra Python Object Store DB] --> B[Source Discovery]
    B --> C[Partition Planner]
    C --> D[Replication Runtime]
    D --> E[Bronze Delta Replica]
    D --> F[Lineage and Checkpoints]
    E --> G[Schema Decode and Drift Detection]
    G --> H[Silver Conformed Tables]
    H --> I[Unity Catalog Publication]
    H --> J[Semantic / Reporting Consumers]
```

## Core Principle
Hydrasil should preserve source truth in bronze while creating governed, queryable Databricks silver datasets.

## Root / Trunk / Branch Metaphor
- Roots: Hydra object-store databases
- Trunk: Hydrasil replication runtime
- Sap flow: hydration into Databricks
- Branches: bronze and silver Delta datasets
- Leaves: semantic layer, reporting, analytics, and AI consumers
