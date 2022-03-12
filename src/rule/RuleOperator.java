package rule;

public class RuleOperator implements RuleI {

    private String type;
    private String value;

    @Override
    public String type() {
        return type;
    }

    @Override
    public String value() {
        return value;
    }
}
