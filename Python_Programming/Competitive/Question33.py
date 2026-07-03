'''
        write a lambda function which accepts two numbers and returns addition.
'''

CalcAddition = lambda  No1 , No2: No1 + No2

def main():
    value1 = int(input("Enter first number : "))
    value2 = int(input("Enter second number : "))

    Ret = CalcAddition(value1 , value2)

    print("Addition is : ",Ret)

if __name__ == "__main__":
    main()