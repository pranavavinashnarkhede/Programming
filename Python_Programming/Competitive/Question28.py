'''
        write a lambda function which accepts two numbers and return maximum number

'''
maximum = lambda  No1 , No2 : No1 if No1 > No2 else No2

def main():
    value1 = int(input("Enter first number : "))
    value2 = int(input("Enter second number : "))

    Ret = maximum(value1 , value2)

    print("Maximum number : ",Ret)

if __name__ == "__main__":
    main()