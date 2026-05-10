# Testing Standards

- Unit tests use JUnit Jupiter 5.10.x.
- Assertions use AssertJ.
- Tests should prove idempotency, checkpoint restart, schema drift detection, and reconciliation behavior.
- Integration tests should be isolated and runnable locally when possible.
- Databricks-dependent tests should be clearly separated and disabled by default unless credentials are present.
