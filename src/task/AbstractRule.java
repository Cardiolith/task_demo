package task;

import com.sun.istack.internal.NotNull;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class AbstractRule implements Rule {
    @NotNull
    protected String value;
    protected Date start;
    protected Date end;
    protected Cycle cycle;
    protected Integer cycleMaxReachTimes;
    protected Integer totalMaxReachTimes;
    protected List<Constraint> constraints;

    @Override
    public boolean isMatch(String event) {
        return this.value.equals(event);
    }

    protected boolean violateConstraints(Map<String, Object> props) {
        boolean violate = false;
        for (Constraint constraint : constraints) {
            boolean flg = true;
            switch (constraint.get$op()) {
                case GT: {
                    Object val = props.get(constraint.getProp());

                }
                case LT: {

                }
                case IN: {

                }
                default:
                    break;
            }
            if (flg) {
                violate = true;
                break;
            }
        }
        return violate;
    }
}
