package customer;

import io.Input;
import io.Output;
import task.*;

import java.util.Date;

public class CustomerTask implements Computable, Stateful {
    private Date start;
    private Date end;
    private String type;
    private RuleCollection<CustomerRule> rules;
    private State state;

    @Override
    public Output compute(Input input) {
        return null;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleCollection<CustomerRule> getRules() {
        return rules;
    }

    public void setRules(RuleCollection<CustomerRule> rules) {
        this.rules = rules;
    }

    @Override
    public State state() {
        return state;
    }
}
