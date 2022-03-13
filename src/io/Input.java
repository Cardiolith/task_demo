package io;

import java.util.Map;

public interface Input {
    String event();
    Long customerId();
    Map<String, Object> props();
}
