# DQR-0003: Schema Strategy

## Question
Should Hydrasil infer schema dynamically, enforce predefined schemas, or use a hybrid source contract model?

## Scope
Covers Python object decoding, field typing, schema evolution, drift detection, incompatible changes, and silver table publication.

## Impact
This determines how much of the source system needs to be understood before silver publication.

## Tie-in
The POC guarantee includes schema drift detection.

## Risk Summary
Overly dynamic schemas may create unstable downstream tables; overly strict schemas may block ingestion unnecessarily.
