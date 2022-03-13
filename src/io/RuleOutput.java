package io;

public class RuleOutput implements Output {

    private String code;

    public RuleOutput(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static RuleOutput success() {
        return new RuleOutput("success");
    }

    public static RuleOutput fail() {
        return new RuleOutput("fail");
    }
}
