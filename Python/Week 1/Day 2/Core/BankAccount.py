class BankAccount:
    # don't forget to add some default values for these parameters!
    def __init__(self, int_rate, balance=0): 
        self.int_rate = int_rate
        self.balance = balance



        # don't worry about user info here; we'll involve the User class soon
    def deposit(self, amount):
        self.balance += amount
        return self
    def withdraw(self, amount):
        if amount< self.balance:
            self.balance-=amount

        else:
            self.balance-=5
            print( "Insufficient funds: Charging a $5 fee")
        return self

        

    def display_account_info(self):
        print("balance: $"+ str (self.balance))
        return self

    def yield_interest(self):
        if self.balance>0:
            self.balance+=self.balance*self.int_rate
        return self

account1= BankAccount(2)
account2= BankAccount(10)

account1.deposit(100).deposit(200).deposit(300).withdraw(200).yield_interest().display_account_info()
account2.deposit(200).deposit(400).withdraw(500).withdraw(20).withdraw(400).withdraw(300).yield_interest().display_account_info()

