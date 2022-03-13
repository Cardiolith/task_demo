package customer;

import task.AbstractRule;
import task.Computable;

public abstract class CustomerAbstractRule extends AbstractRule implements Computable, Stateful {
    private Integer currentCycleReachTimes;
    private Integer currentTotalReachTimes;
}
