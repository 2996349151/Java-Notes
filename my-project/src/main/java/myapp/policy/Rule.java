package myapp.policy;

import myapp.domain.Request;

public interface Rule {
    boolean test(Request request);
}
