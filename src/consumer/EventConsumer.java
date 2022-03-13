package consumer;

import customer.CustomerTaskTemplate;
import io.Input;
import task.Scope;
import task.TaskTemplate;

import java.util.ArrayList;
import java.util.List;

public class EventConsumer {

    public void consume(Input input) {
        List<TaskTemplate> tasks = new ArrayList<>();
        for (TaskTemplate task : tasks) {
            if (qualified(input, task)) {
                CustomerTaskTemplate customerTaskTemplate = null;
                if (customerTaskTemplate == null) {
                    customerTaskTemplate = task.create(input.customerId());
                    customerTaskTemplate.compute(input);
                }
            }
        }
    }

    public static boolean qualified(Input input, TaskTemplate taskTemplate) {
        if (taskTemplate.getScope() == Scope.ANY) {
            return true;
        } else if (taskTemplate.getScope() == Scope.LIST) {

        }

        return false;
    }
}
