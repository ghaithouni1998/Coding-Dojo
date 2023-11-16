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
    
class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)

# other methods

    def deposit(self, amount):
        self.account.deposit(amount)
        return self
    
    def withdraw(self, amount):
        self.account.withdraw(amount)
        return self
    
    def display_user_balance(self):
        self.account.display_account_info()
        return self

user1 = User("john","j@.com")
user1.deposit(50).display_user_balance()


        
        