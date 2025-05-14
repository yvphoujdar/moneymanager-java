import java.util.ArrayList;
import java.util.List;

public class MoneyManager {
    private List<transaction> transactions;

    public MoneyManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String type, double amount, String description) {
        transactions.add(new transaction(type, amount, description));
    }

    public double getBalance() {
        double balance = 0;
        for (transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Income")) {
                balance += t.getAmount();
            } else if (t.getType().equalsIgnoreCase("Expense")) {
                balance -= t.getAmount();
            }
        }
        return balance;
    }

    public void printTransactions() {
        for (transaction t : transactions) {
            System.out.println(t);
        }
    }
}
