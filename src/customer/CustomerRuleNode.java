package customer;

import io.Input;
import io.Output;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerRuleNode implements RuleCollection<CustomerRule> {

    private CustomerRule rule;
    private List<CustomerRuleNode> nodes;

    @Override
    public Output compute(Input input) {
        if (rule instanceof CustomerRuleOperator) {
            String ops = ((CustomerRuleOperator) rule).getOperator();
            List<Output> outputs = nodes.stream().map(node -> node.compute(input)).collect(Collectors.toList());
            if (ops.equals("&")) {

            } else if (ops.equals("|")){

            }
        }
        return rule.compute(input);
    }
}
