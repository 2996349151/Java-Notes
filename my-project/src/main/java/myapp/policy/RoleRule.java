package myapp.policy;

import myapp.domain.Request;
import myapp.domain.RuleData;

public class RoleRule implements Rule {
    private RuleData data;

    public RoleRule(RuleData data) {
        this.data = data;
    }

    @Override
    public boolean test(Request request) {
        String requestRole = request.getUser().getRole();
        String ruleRole = data.getValue();

        switch (data.getOperator()) {
            case "==":
                return requestRole.equals(ruleRole);
            case "!=":
                return !requestRole.equals(ruleRole);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + data.getOperator());
        }
    }
}
