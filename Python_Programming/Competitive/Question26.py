'''
        write a lambda function which accepts one number and return square of that number
'''

CalcSquare = lambda No : No * No

def main():
    value = int(input("Enter number : "))

    Ret = CalcSquare(value)

    print("Square : ",Ret)

if __name__ == "__main__":
    main()