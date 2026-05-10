# Hydra Source Assumptions

Initial assumptions to validate:

- Source is an object-store-backed Python database family.
- Object keys carry at least partial logical structure.
- Objects may contain Python-specific encodings that are not directly queryable by Databricks.
- A stable object identity can likely be derived from key, version, hash, and source database name.
- Source metadata may not be sufficient for correctness without content hashes or manifests.
