package myapp.workflow;

import myapp.domain.Request;

public class ValidationStep implements WorkflowStep {
    @Override
    public void execute(Request request) {
        System.out.println("Validating request ID: " + request.getId());
        // Add validation logic here
    }       
    
}
