package task;

import customer.CustomerTask;
import io.Input;

import java.util.Date;
import java.util.List;

public class Task {
    private Date start;
    private Date end;
    private String type;
    private List<Rule> rules;

    public CustomerTask create() {
        CustomerTask customerTask = new CustomerTask();
        customerTask.setStart(start);
        customerTask.setEnd(end);
        customerTask.setType(type);

        return customerTask;
    }

    public boolean containsEvent(Input input) {
        boolean contains = false;
        for (Rule rule : rules) {
            if (rule.isMatch(input.event())) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
