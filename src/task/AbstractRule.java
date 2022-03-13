package task;

import com.sun.istack.internal.NotNull;

import java.util.List;

public abstract class AbstractRule implements Rule {
    @NotNull
    protected String value;
    protected Cycle cycle;
    protected Integer cycleMaxReachTimes;
    protected Integer totalMaxReachTimes;
    protected List<Constraint> constraints;

    @Override
    public boolean isMatch(String event) {
        return this.value.equals(event);
    }
}
