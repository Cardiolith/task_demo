package customer;

import task.AbstractRule;
import task.Computable;
import task.CronCycle;
import task.NonCycle;

import java.util.Date;
import java.util.List;

public abstract class CustomerAbstractRule extends AbstractRule implements Computable, Stateful {
    protected Integer currentCycle;
    protected Date lastCalDate;
    protected Integer currentCycleReachTimes;
    protected Integer currentTotalReachTimes;
    protected List<Integer> reachHistory;

    protected Integer getEventCycleOrder(Date date) {
        if (cycle instanceof CronCycle) {
            return ((CronCycle) cycle).getCycleOrder(this.start, date);
        }
        return -1;
    }
}
