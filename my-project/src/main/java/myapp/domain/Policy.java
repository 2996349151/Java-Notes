package myapp.domain;

import java.util.ArrayList;

public class Policy {
    private String name;
    private ArrayList<Rule> rules;

    public Policy(String name) {
        this.name = name;
        this.rules = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }
}