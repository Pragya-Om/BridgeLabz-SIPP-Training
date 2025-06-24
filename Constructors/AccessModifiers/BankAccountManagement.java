package Constructors.AccessModifiers;

public class BankAccountManagement {

    static class BankAccount {
        public String accountNumber;
        protected String accountHolder;
        private double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("₹" + amount + " deposited successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        public void displayAccountDetails() {
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Holder : " + accountHolder);
            System.out.println("Balance        : ₹" + balance);
            System.out.println("-----------------------------");
        }
    }

   
    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate = interestRate;
        }

        public void displaySavingsDetails() {
            System.out.println("Savings Account Details:");
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Holder : " + accountHolder);
            System.out.println("Interest Rate  : " + interestRate + "%");
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC123", "Ravi Sharma", 8000);
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayAccountDetails();

        SavingsAccount sav1 = new SavingsAccount("SAV456", "Anjali Mehta", 12000, 3.5);
        sav1.displaySavingsDetails();
        sav1.deposit(1500);
        sav1.withdraw(2000);
        sav1.displayAccountDetails();
    }
}
