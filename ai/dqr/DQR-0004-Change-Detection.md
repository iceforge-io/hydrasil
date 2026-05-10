# DQR-0004: Change Detection

## Question
How should Hydrasil detect source changes?

## Scope
Evaluate object timestamps, object size, object-store version IDs, source manifests, explicit source database indexes, and content hashes.

## Impact
This controls idempotency, incremental replication, checkpoint compaction, and reconciliation.

## Tie-in
The object identity model currently includes object key, version ID, content hash, and observed timestamp.

## Risk Summary
Timestamp-only change detection may be insufficient if source writes are non-atomic or metadata is unreliable.
