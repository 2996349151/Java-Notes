package myapp.service;

import myapp.workflow.WorkflowStep;
import myapp.domain.Request;

import java.util.List;

public class WorkflowExecutor {
    private final List<WorkflowStep> steps;

    public WorkflowExecutor(List<WorkflowStep> steps) {
        this.steps = steps;
    }

    public void execute(Request request) {
        for (WorkflowStep step : steps) {
            step.execute(request);
        }
    }
}
