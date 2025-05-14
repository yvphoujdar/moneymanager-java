import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MoneyManager manager = new MoneyManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMoney Manager");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount: ");
                    double income = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter description: ");
                    String incDesc = scanner.nextLine();
                    manager.addTransaction("Income", income, incDesc);
                    break;
                case 2:
                    System.out.print("Enter expense amount: ");
                    double expense = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter description: ");
                    String expDesc = scanner.nextLine();
                    manager.addTransaction("Expense", expense, expDesc);
                    break;
                case 3:
                    System.out.println("Current balance: $" + manager.getBalance());
                    break;
                case 4:
                    manager.printTransactions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
