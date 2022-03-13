package task;

public class StaticRule implements Rule {

    @Override
    public boolean isMatch(String event) {
        return false;
    }
}
