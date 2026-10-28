'''
        write a program which accepts two numbers and prints addition , substraction , multiplication and division
'''

def Addition(No1 , No2):
    return No1 + No2

def Substraction(No1 ,No2):
    return No1 - No2

def Multiplication(No1 , No2):
    return No1 * No2

def Division(No1 , No2):
    return No1 // No2

def main():
    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret = Addition(Value1 , Value2)
    print("Addition : ",Ret)

    Ret = Substraction(Value1 , Value2)
    print("Substraction : ",Ret)

    Ret = Multiplication(Value1 , Value2)
    print("Multiplication : ",Ret)

    Ret = Division(Value1 , Value2)
    print("Division : ",Ret)

if __name__ == "__main__":
    main()