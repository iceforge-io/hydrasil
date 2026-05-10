# DQR-0006: Databricks Target Layout

## Question
What should the bronze and silver Delta table layouts look like?

## Scope
Define catalog/schema/table naming, partitioning, clustering, object metadata columns, payload handling, decoded record tables, lineage tables, and reconciliation tables.

## Impact
This affects performance, governance, discoverability, Unity Catalog publication, and semantic/reporting readiness.

## Tie-in
Hydrasil is not only copying data; it is turning object-store databases into governed lakehouse data products.

## Risk Summary
Poor table layout can make the POC appear functionally correct but operationally unusable at production volume.
