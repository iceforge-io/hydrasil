# DQR-0001: Source Database Contract

## Question
What exactly makes each Python object-store database a database?

## Scope
Identify whether the source contract is based on manifests, object naming conventions, indexes, embedded metadata, Python pickles, JSON blobs, Parquet fragments, custom classes, or a combination.

## Impact
This determines the source discovery mechanism, object identity model, partitioning strategy, schema extraction, and replay correctness.

## Tie-in
Hydrasil cannot guarantee idempotent replication until it understands stable source object identity and database boundaries.

## Risk Summary
If this is not defined, the POC may replicate files but fail to replicate the logical database.
