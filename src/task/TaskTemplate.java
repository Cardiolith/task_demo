package task;

import customer.CustomerTask;
import customer.CustomerTaskTemplate;
import io.Input;

import java.util.ArrayList;
import java.util.List;

public class TaskTemplate {
    private String id;
    private Criteria criteria;
    private Scope scope;
    private List<Task> tasks;

    public CustomerTaskTemplate create(Long customerId) {
        CustomerTaskTemplate customerTaskTemplate = new CustomerTaskTemplate();
        customerTaskTemplate.setTaskId(this.id);
        customerTaskTemplate.setCustomerId(customerId);
        customerTaskTemplate.setScope(this.scope);
        customerTaskTemplate.setCriteria(this.criteria);
        List<CustomerTask> customerTasks = new ArrayList<>();
        tasks.forEach(task -> customerTasks.add(task.create()));
        customerTaskTemplate.setTasks(customerTasks);
        return customerTaskTemplate;
    }

    public boolean containsEvent(Input input) {
        for (Task task : this.tasks) {
        }

        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
