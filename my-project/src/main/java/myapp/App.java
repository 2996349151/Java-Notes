package myapp;

import myapp.domain.*;
import myapp.workflow.*;
import myapp.service.WorkflowExecutor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        User user = new User("U001", "Alice", "MANAGER");
        Request req = new Request("REQ01", "EXPENSE", "1500.0", user);

        Policy policy = new Policy("HighValuePolicy");
        policy.addRule(new RuleData("amount", ">", "1000"));
        policy.addRule(new RuleData("role", "==", "MANAGER"));

        WorkflowExecutor executor = new WorkflowExecutor(
            List.of(
                new ValidationStep(),
                new PolicyEvaluationStep(policy),
                new ApprovalStep(),
                new AuditStep()
            )
        );

        executor.execute(req);
    }
}