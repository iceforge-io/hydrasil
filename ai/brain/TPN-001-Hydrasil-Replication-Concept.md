# TPN-001: Hydrasil Replication Concept

Hydrasil is the world-tree bridge between Hydra object-store databases and Databricks Lakehouse data products.

The core idea is not file copying. The core idea is controlled hydration:

1. Discover opaque source object databases.
2. Preserve source-level identity and lineage.
3. Decode Python object semantics into structured lakehouse records.
4. Publish governed datasets that can feed reporting, semantic layers, and AI-assisted analysis.

## Suggested Future Branches

- TPN-001-001: Bronze table layout
- TPN-001-002: Schema drift model
- TPN-001-003: Source manifest contract
- TPN-001-004: Databricks execution options
