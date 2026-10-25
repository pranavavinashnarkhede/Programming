'''
        write a lambda function which accepts two numbers and return minimum number.
'''

minimum = lambda  No1 , No2 : No2 if No1 > No2 else No1

def main():
    value1 = int(input("Enter first number : "))
    value2 = int(input("Enter second number : "))

    Ret = minimum(value1 , value2)

    print("Minimum number : ",Ret)

if __name__ == "__main__":
    main()