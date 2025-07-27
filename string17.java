// Base class
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Savings Account with interest
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Checking Account with overdraft
class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

// Fixed Deposit Account
class FDAccount extends BankAccount {
    int termInYears;
    double fdInterestRate;

    FDAccount(int accountNumber, double balance, int termInYears, double fdInterestRate) {
        super(accountNumber, balance);
        this.termInYears = termInYears;
        this.fdInterestRate = fdInterestRate;
    }

    double calculateMaturityAmount() {
        return balance + (balance * fdInterestRate * termInYears / 100);
    }
}


public class string17 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1, 1000, 5);
        sa.displayBalance();
        sa.addInterest();
        sa.displayBalance();

        System.out.println();

        CheckingAccount ca = new CheckingAccount(2, 2000, 500);
        ca.displayBalance();
        ca.withdraw(2500);
        ca.displayBalance();

        System.out.println();

        FDAccount fd = new FDAccount(3, 5000, 2, 6);
        fd.displayBalance();
        System.out.println("Maturity Amount: " + fd.calculateMaturityAmount());
    }
}
