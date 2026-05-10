# DQR-0005: Scale-Out Execution Model

## Question
Should Hydrasil run replication using Databricks jobs, external Spring/Python workers, Spark Structured Streaming, Auto Loader, or a custom Spark reader?

## Scope
Evaluate operational ownership, throughput, cost, restart behavior, source object decoding complexity, and Databricks integration.

## Impact
The execution model determines how millions of objects are partitioned, retried, checkpointed, and reconciled.

## Tie-in
The POC must scale-test millions of objects with concurrent partition ingestion and restart after failure.

## Risk Summary
Choosing too much custom infrastructure too early may slow delivery; choosing too little may not handle Python object decoding or correctness guarantees.
