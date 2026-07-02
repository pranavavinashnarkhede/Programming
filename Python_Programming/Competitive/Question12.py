'''
       write a program which accepts one number and prints count of digits in that number.

       Input : 7521
       Output : 4 
'''

def CountDigit(No):
    Cnt = 0 

    while (No != 0 ):
        No % 10 
        Cnt = Cnt + 1
        No = No // 10     # in python single / perform float division so for int division use // 

    return Cnt

def main():
    Value = int(input("Enter number : "))
    Ret = CountDigit(Value)

    print("Count of digits : ",Ret)

if __name__ == "__main__":
    main()