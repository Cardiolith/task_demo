package rule;

import constraint.ConstraintI;

import java.util.List;

public abstract class AbstractRule implements RuleI {

    protected String type;
    protected String value;
    protected List<ConstraintI> constraint;

    @Override
    public String type() {
        return type;
    }

    @Override
    public String value() {
        return value;
    }
}
