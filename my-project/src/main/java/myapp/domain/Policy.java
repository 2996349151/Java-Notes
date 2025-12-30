package myapp.domain;

import java.util.ArrayList;

public class Policy {
    private String name;
    private ArrayList<RuleData> rules;
    public Policy(String name) {
        this.name = name;
        this.rules = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<RuleData> getRules() {
        return rules;
    }

    public void addRule(RuleData rule) {
        this.rules.add(rule);
    }
}