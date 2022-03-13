package task;

public class Constraint {
    private String prop;
    private ConstraintOps $op;
    private Object value;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public ConstraintOps get$op() {
        return $op;
    }

    public void set$op(ConstraintOps $op) {
        this.$op = $op;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public enum ConstraintOps {
        GT, LT, IN
    }
}
