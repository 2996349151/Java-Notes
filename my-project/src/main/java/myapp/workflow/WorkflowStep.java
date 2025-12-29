package myapp.workflow;

import myapp.domain.Request;

public interface WorkflowStep {
    void execute(Request request);
}
