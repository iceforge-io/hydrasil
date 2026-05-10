# Hydrasil

**Hydrasil** is an Ice Forge proof-of-concept platform for replicating high-volume Python object-store databases into Databricks as governed, scalable lakehouse datasets.

The name intentionally combines the existing **Hydra** object-store lineage with the Nordic **Yggdrasil** theme used across Ice Forge systems. The platform hydrates Databricks from Hydra-style object stores and turns opaque object databases into bronze and silver Delta Lake data products.

## POC Objective

Input: one representative Python object-store database.

Output:

- Bronze Delta replica tables
- Silver structured/conformed tables
- Object-level lineage
- Checkpointed/idempotent replication state
- Schema drift detection
- Count and completeness reconciliation

POC guarantees:

- Idempotent reruns
- Restart after failure
- Object-level lineage and auditability
- Schema drift detection
- Row/object count reconciliation
- Concurrent partition ingestion
- Scale test with millions of objects

## Maven Modules

```text
hydrasil
├── hydrasil-core            # pure domain model, contracts, checkpoint model, lineage model
├── hydrasil-ingest          # source discovery, object reading, partition planning
├── hydrasil-lineage         # lineage events, reconciliation records, object audit trail
├── hydrasil-schema          # schema inference, schema contracts, drift detection
├── hydrasil-dbx             # Databricks/Delta writer integration boundary
├── hydrasil-runtime         # orchestration/runtime services
├── hydrasil-catalog         # Unity Catalog / table publication boundary
├── hydrasil-observability   # metrics, health, progress reporting
└── hydrasil-server          # Spring Boot API and operational control plane
```

## Build

```bash
mvn clean verify
```

Run the server:

```bash
mvn -pl hydrasil-server spring-boot:run
```

## Branding and Coordinates

- Organization: **Ice Forge**
- Domain: **iceforge.io**
- Maven groupId: `org.iceforge.hydrasil`
- Java package root: `org.iceforge.hydrasil`

## Architecture Notes

Design material is kept under `ai/`:

- `ai/adr` — Architecture Decision Records
- `ai/dqr` — Design Question Records
- `ai/plan` — implementation and POC plans
- `ai/existing-architecture` — notes on Hydra/object-store source model
- `ai/new-design` — target Hydrasil design
- `ai/standards` — repo and coding standards for AI-assisted development
- `ai/brain` — idea tree / TPN-compatible notes
