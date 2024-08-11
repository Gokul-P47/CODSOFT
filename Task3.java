import java.util.*;
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance =balance + amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        while (true) {
            System.out.println("\nATM Options:");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n 4. Exit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositM = sc.nextDouble();
                    account.deposit(depositM);
                    System.out.println("Deposit successful!");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawM = sc.nextDouble();
                    if (account.withdraw(withdrawM)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
    }
}
