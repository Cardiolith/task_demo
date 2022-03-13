package customer;

import io.Input;
import io.Output;
import task.CommonRule;
import task.State;

public class CustomerCommonRule extends CommonRule implements CustomerRule, Stateful {

    private State state;

    @Override
    public State state() {
        return this.state;
    }

    @Override
    public Output compute(Input input) {
        return null;
    }
}
