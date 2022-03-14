package customer;

import io.Input;
import io.NonOutput;
import io.Output;
import io.RuleOutput;
import task.CronCycle;
import task.NonCycle;

public class CustomerCommonRule extends CustomerAbstractRule {

    @Override
    public Output compute(Input input) {
        if (state == State.FINISHED) {
            return NonOutput.nonOutput();
        }
        if (!isMatch(input.event())) {
            return NonOutput.nonOutput();
        }
        if (violateConstraints(input.props())) {
            return NonOutput.nonOutput();
        }
        if (cycle instanceof NonCycle) {
            this.currentCycleReachTimes++;
            if (this.currentCycleReachTimes >= this.totalMaxReachTimes) {
                this.state = State.FINISHED;
                return RuleOutput.success();
            }
        } else if (cycle instanceof CronCycle) {
            Integer eventCycle = this.getEventCycleOrder(input.date());
            if (eventCycle == currentCycle) {
                this.totalMaxReachTimes = this.totalMaxReachTimes + 1;
            } else {
                /** TODO **/
            }
        }

        return NonOutput.nonOutput();
    }
}
