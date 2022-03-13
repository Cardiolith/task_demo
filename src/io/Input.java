package io;

import java.util.Date;
import java.util.Map;

public interface Input {
    String event();
    Long customerId();
    Date date();
    Map<String, Object> props();
}
