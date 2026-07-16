class BankAccount : 
    ROI = 10.5

    def __init__(self , name , amount):
        self.Name = name
        self.Amount = amount

    def Display(self):
        print(f"Name of Account Holder : {self.Name}")
        print(f"Account balance : {self.Amount}")

    def Deposit(self):
        value = int(input("Enter the amount that you want to deposit : "))
        self.Amount = self.Amount + value

    def Withdraw(self):
        value = int(input("Enter the amount that you want to withdraw : "))

        if value > self.Amount:
            print("Your balance is Insufficient for withdraw")
        else: 
            self.Amount = self.Amount - value

    def CalculateInterest(self):
        return (self.Amount * BankAccount.ROI) / 100           

def main():

    obj1 = BankAccount("Pranav" , 5000)
    obj2 = BankAccount("Pratik " , 12000)

    obj1.Display()
    obj1.Deposit()
    obj1.Display()
    obj1.Withdraw()
    obj1.Display()
    Ret = obj1.CalculateInterest()
    print("Interest : ",Ret)

    obj2.Display()
    obj2.Deposit()
    obj2.Display()
    obj2.Withdraw()
    obj2.Display()
    Ret = obj2.CalculateInterest()
    print("Interest : ",Ret)

if __name__ == "__main__":
    main()