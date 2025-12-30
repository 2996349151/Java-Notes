package myapp.policy;

import myapp.domain.Request;
import myapp.domain.RuleData;

public class StringRule implements Rule {
    private RuleData data;

    public StringRule(RuleData data) {
        this.data = data;
    }

    @Override
    public boolean test(Request request) {
        String requestValue = request.getType();
        String ruleValue = data.getValue();

        switch (data.getOperator()) {
            case "==":
                return requestValue.equals(ruleValue);
            case "!=":
                return !requestValue.equals(ruleValue);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + data.getOperator());
        }
    }
}