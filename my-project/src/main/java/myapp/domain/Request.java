package myapp.domain;

public class Request {
    private String id;
    private String type;
    private String amount;
    private User user;

    public Request(String id, String type, String amount, User user) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }
}