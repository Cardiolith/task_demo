package task;

public class RuleOperator implements Rule {

    protected String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean isMatch(String event) {
        return false;
    }
}
