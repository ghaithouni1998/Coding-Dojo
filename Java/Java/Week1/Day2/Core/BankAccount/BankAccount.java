public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; 
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance=checkingBalance ;
        this.savingsBalance=savingsBalance;
        this.accounts++;
        this.totalMoney =(checkingBalance+savingsBalance);
    }
     public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

     public double getTotalMoney() {
        return this.totalMoney;
    }
    public int getAccount(){
        return this.accounts;
    }
    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount; 
    }
    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalMoney -= amount; 
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

 public void getBalance() {
        System.out.println("Checking Balance: " + checkingBalance);
        System.out.println("Savings Balance: " + savingsBalance);
    }

}