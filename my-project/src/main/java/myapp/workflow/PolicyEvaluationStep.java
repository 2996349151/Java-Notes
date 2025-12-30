package myapp.workflow;

import myapp.domain.Policy;
import myapp.domain.Request;
import myapp.domain.RuleData;
import myapp.policy.*;

public class PolicyEvaluationStep implements WorkflowStep {
    private Policy policy;
    
    public PolicyEvaluationStep(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void execute(Request request) {
        System.out.println("Evaluating policy: " + policy.getName());
        for (RuleData ruleData : policy.getRules()) {
            if (ruleData.getField().equals("amount")){
                Rule rule = new NumericRule(ruleData);
                if (rule.test(request)){
                    System.out.println("Rule on field 'amount' evaluated to: true");
                } else {
                    throw new IllegalArgumentException("Rule on field 'amount' evaluated to: false");
                }
            } else if (ruleData.getField().equals("type")) {
                Rule rule = new StringRule(ruleData);
                if (rule.test(request)){
                    System.out.println("Rule on field 'type' evaluated to: true");
                } else {
                    throw new IllegalArgumentException("Rule on field 'type' evaluated to: false");
                }
            } else if (ruleData.getField().equals("role")) {
                Rule rule = new RoleRule(ruleData);
                if (rule.test(request)){
                    System.out.println("Rule on field 'role' evaluated to: true");
                } else {
                    throw new IllegalArgumentException("Rule on field 'role' evaluated to: false");
                }
            } else {
                throw new IllegalArgumentException("Unsupported rule field: " + ruleData.getField());
            }
        }
    }

}