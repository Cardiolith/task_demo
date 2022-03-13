package customer;

import io.Input;
import io.Output;
import task.State;
import task.StaticRule;

public class CustomerStaticRule extends StaticRule implements CustomerRule, Stateful {

    @Override
    public Output compute(Input input) {
        return null;
    }

    @Override
    public State state() {
        return null;
    }
}
