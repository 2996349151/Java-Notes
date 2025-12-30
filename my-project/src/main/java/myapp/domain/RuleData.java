package myapp.domain;

public class RuleData {
    private String field;
    private String operator;
    private String value;

    public RuleData(String field, String operator, String value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public String getOperator() {
        return operator;
    }

    public String getValue() {
        return value;
    }
}
