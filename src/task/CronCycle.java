package task;

import java.util.Date;
import java.util.TimeZone;

public class CronCycle implements Cycle {

    private String cronExpression;
    private TimeZone timeZone;

    public Integer getCycleOrder(Date start, Date target) {

        return -1;
    }
}
