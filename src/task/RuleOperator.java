package task;

public class RuleOperator implements Rule {

    private String operator;

    @Override
    public boolean isMatch(String event) {
        return false;
    }
}
