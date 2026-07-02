'''
        write a program which accepts one number and prints sum if digits

        Input : 123
        Output : 6
'''

def SumDigit(No):
    Cnt = 0
    sum = 0  

    while (No != 0 ):
        sum = sum + No % 10 
        No = No // 10  
           
    return sum

def main():
    Value = int(input("Enter number : "))
    Ret = SumDigit(Value)

    print("Sum of digits : ",Ret)

if __name__ == "__main__":
    main()