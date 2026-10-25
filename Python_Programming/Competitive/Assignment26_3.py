class Arithmetic:
    def __init__(self):
        self.value1 = 0 
        self.value2 = 0 

    def Accept(self):
        no1 = int(input("Enter first value : "))
        no2 = int(input("Enter second value : "))

        self.value1 = no1
        self.value2 = no2

    def Addition(self):
        return self.value1 + self.value2

    def Substraction(self):
        return self.value1 - self.value2

    def Multiplication(self):
        return self.value1 * self.value2

    def Division(self):

        if self.value2 == 0 :
            print("Cannot divide by zero ")
            return 
        else:
            return self.value1 / self.value2

def main():

    obj1 = Arithmetic()
    obj2 = Arithmetic()

    obj1.Accept()

    print()
    Ret = obj1.Addition()
    print("Addition is : ",Ret)

    Ret = obj1.Substraction()
    print("Substraction is : ",Ret)

    Ret = obj1.Multiplication()
    print("Multiplication is : ",Ret)

    Ret = obj1.Division()
    print("Division is : ",Ret)

    print()

    obj2.Accept()
    Ret = obj2.Addition()
    print("Addition is : ",Ret)

    Ret = obj2.Substraction()
    print("Substraction is : ",Ret)

    Ret = obj2.Multiplication()
    print("Multiplication is : ",Ret)

    Ret = obj2.Division()
    print("Division is : ",Ret)



if __name__ == "__main__":
    main()

    