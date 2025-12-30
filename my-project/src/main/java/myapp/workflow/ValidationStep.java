package myapp.workflow;

import myapp.domain.Request;

// Simple validation to check that required fields exist and are sensible
public class ValidationStep implements WorkflowStep {
    @Override
    public void execute(Request request) {
        System.out.println("Validating request ID: " + request.getId());
        if (request.getId() == null) {
            throw new IllegalArgumentException("Request ID is missing");
        }
        else if (request.getType() == null){
            throw new IllegalArgumentException("Request type is missing");
        }
        else if (request.getAmount() == null){
            throw new IllegalArgumentException("Request amount is missing");
        }
        else if (Double.parseDouble(request.getAmount()) <= 0){
            throw new IllegalArgumentException("Request amount must be positive");
        }
        else if (request.getUser() == null){
            throw new IllegalArgumentException("Request user is missing");
        }
        else if (request.getUser().getUserId() == null){
            throw new IllegalArgumentException("User ID is missing");
        }
        else if (request.getUser().getName() == null){
            throw new IllegalArgumentException("User name is missing");
        }
        else if (request.getUser().getRole() == null){
            throw new IllegalArgumentException("User role is missing");
        }
        else {
            System.out.println("Request ID: " + request.getId() + " is valid.");
        }
    }       
    
}
