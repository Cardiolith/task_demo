package customer;

import io.Input;
import io.Output;
import task.StaticRule;

public class CustomerStaticRule extends StaticRule implements CustomerRule, Stateful {

    @Override
    public Output compute(Input input) {
        if (!isMatch(input.event())) {

        }
        return null;
    }

    @Override
    public State state() {
        return null;
    }
}
