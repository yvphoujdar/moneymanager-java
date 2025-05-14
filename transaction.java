public class transaction {
    private String type; 
    private double amount;
    private String description;

    public transaction(String type, double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }

    public String toString() {
        return type + ": $" + amount + " - " + description;
    }
}
