package myapp.policy;

import myapp.domain.Request;
import myapp.domain.RuleData;

public class NumericRule implements Rule {
    private RuleData data;

    public NumericRule(RuleData data) {
        this.data = data;
    }
    
    @Override
    public boolean test(Request request) {
        double requestValue = Double.parseDouble(request.getAmount());
        double ruleValue = Double.parseDouble(data.getValue());

        switch (data.getOperator()) {
            case ">":
                return requestValue > ruleValue;
            case "<":
                return requestValue < ruleValue;
            case ">=":
                return requestValue >= ruleValue;
            case "<=":
                return requestValue <= ruleValue;
            case "==":
                return requestValue == ruleValue;
            case "!=":
                return requestValue != ruleValue;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + data.getOperator());
        }
        
    }
}
