public class BankTest {
    public static void main(String[] args){
        //Instantiate the bank account object and call deposit method to add money into it, then withdraw some amount from it
            BankAccount account1= new BankAccount(5000,850);
            BankAccount account2= new BankAccount(8000,1800);
            BankAccount account3= new BankAccount(9000,4000);

        
        account1.depositCheckingBalance(1000);
        account1.totalBalance();

        account2.depositSavingBalance1(500);
        account2.totalBalance();
        account3.withdrawCheckingBalance(2500);
        account3.totalBalance();
        System.out.printf("numero of accont = "+BankAccount.getAccount());
        System.out.printf(" total is = "+BankAccount.getTotalMoney());

    }
}