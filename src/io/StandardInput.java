package io;

import java.util.Map;

public class StandardInput implements Input {

    private String event;
    private Long customerId;
    private Map<String, Object> props;

    @Override
    public String event() {
        return event;
    }

    @Override
    public Long customerId() {
        return customerId;
    }

    @Override
    public Map<String, Object> props() {
        return props;
    }
}
