public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
            BankAccount account1= new BankAccount(3000,500);
            BankAccount account2= new BankAccount(4000,400);
            BankAccount account3= new BankAccount(5000,500);

        
        account1.depositCheckingBalance(600);
        account1.totalBalance();

        account2.depositSavingBalance(500);
        account2.totalBalance();
        account3.withdrawCheckingBalance(1500);
        account3.totalBalance();
        System.out.printf("num of bank account is "+BankAccount.getAccount());
        System.out.printf("The total money is "+BankAccount.getTotalMoney());

    }
}