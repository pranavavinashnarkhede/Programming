""" write a program which accepts one number and prints square of that number.

    Input : 5
    Output : 25
"""

def CalcSquare(No):
    return No*No

def main():
    Value = int(input("Enter number : "))
    Ret = CalcSquare(Value)
    print("Square : ",Ret)
    
if __name__ == "__main__":
    main()