package customer;

import io.Input;
import io.Output;
import task.Computable;
import task.Criteria;
import task.Scope;
import task.State;

import java.util.List;

public class CustomerTaskTemplate implements Computable, Stateful {
    private String id;
    private String taskId;
    private Long customerId;
    private Criteria criteria;
    private Scope scope;
    private List<CustomerTask> tasks;
    private State state;

    @Override
    public Output compute(Input input) {
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public List<CustomerTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<CustomerTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public State state() {
        return state;
    }
}
