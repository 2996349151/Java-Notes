package myapp.workflow;

import myapp.domain.Request;
import myapp.io.FileUtils;

public class AuditStep implements WorkflowStep {
    @Override
    public void execute(Request request) {
        System.out.println("Auditing request ID: " + request.getId());
        // write audit log to file
        FileUtils.write("src/main/resources/audit.log", "Auditing request ID: " + request.getId());
    }
    
}
