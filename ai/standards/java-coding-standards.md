# Java Coding Standards

- Use Java 21.
- Prefer records for immutable value objects.
- Keep domain model in `hydrasil-core` free of Spring dependencies.
- Constructor-validate required fields.
- Avoid static global mutable state.
- Keep Databricks-specific code in `hydrasil-dbx`.
- Tests should accompany domain behavior and service boundaries.
