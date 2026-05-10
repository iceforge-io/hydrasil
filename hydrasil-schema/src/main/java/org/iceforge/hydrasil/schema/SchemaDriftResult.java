package org.iceforge.hydrasil.schema;

import java.util.List;

public record SchemaDriftResult(boolean driftDetected, List<String> changes) { }
