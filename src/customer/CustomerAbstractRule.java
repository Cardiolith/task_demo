package customer;

import task.AbstractRule;
import task.CronCycle;

import java.util.Date;
import java.util.List;

public abstract class CustomerAbstractRule extends AbstractRule implements CustomerRule, Stateful {
    protected Integer currentCycle;
    protected Date lastCalDate;
    protected Integer currentCycleReachTimes;
    protected Integer currentTotalReachTimes;
    protected List<Integer> reachHistory;
    protected State state;

    protected Integer getEventCycleOrder(Date date) {
        if (cycle instanceof CronCycle) {
            return ((CronCycle) cycle).getCycleOrder(this.start, date);
        }
        return -1;
    }

    @Override
    public State state() {
        return state;
    }
}
