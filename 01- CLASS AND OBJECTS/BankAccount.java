
class BankAccountManagement {
    String AccountHolder;
    double balance;
    double withdraw;

    void display(double amountDeposited) {
        balance = balance + amountDeposited;
        System.out.println("Deposited Amount: " + amountDeposited);
    }

    void displayBalance() {
        System.out.println("After Deposited Account Balance : " + balance);
    }

    void displayWithdraw() {
        System.out.println("After withdraw : " + (balance - withdraw));

    }
}

class BankAccount {
    public static void main(String[] args) {
        BankAccountManagement b1 = new BankAccountManagement();
        b1.AccountHolder = "Kirubhakaran R";
        b1.balance = 15000;
        b1.withdraw = 10000;

        System.out.println("Account Holder Name : " + b1.AccountHolder);

        System.out.println("Account Balance : " + b1.balance);
        b1.display(50000);

        b1.displayBalance();
        System.out.println("Withdraw Amount : " + b1.withdraw);
        b1.displayWithdraw();

    }
}