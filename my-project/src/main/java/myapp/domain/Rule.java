package myapp.domain;

public class Rule {
    private String type;
    private String threshold;
    private String comparator;

    public Rule(String type, String threshold, String comparator) {
        this.type = type;
        this.threshold = threshold;
        this.comparator = comparator;
    }

    public String getType() {
        return type;
    }

    public String getThreshold() {
        return threshold;
    }

    public String getComparator() {
        return comparator;
    }
}
