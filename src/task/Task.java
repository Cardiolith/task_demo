package task;

import customer.CustomerTask;

import java.util.Date;

public class Task {
    private Date start;
    private Date end;
    private String type;
    private RuleCollection<Rule> rules;

    public CustomerTask create() {
        CustomerTask customerTask = new CustomerTask();
        customerTask.setStart(start);
        customerTask.setEnd(end);
        customerTask.setType(type);

        return customerTask;
    }
}
