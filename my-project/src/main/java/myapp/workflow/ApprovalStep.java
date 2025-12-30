package myapp.workflow;

import myapp.domain.Request;

public class ApprovalStep implements WorkflowStep {
    @Override
    public void execute(Request request) {
        System.out.println("Executing approval step for request ID: " + request.getId());
        System.out.println("Approved (simulate user approval).");
    }
}
