'''
        write a program which accepts one number and prints sum of first N natural numbers .

        Input : 5
        Output : 15
'''

def CalcSum(No):
    sum = 0 
    for i in range(1 , No+1):
        sum = sum + i 

    return sum 

def main():
    Value = int(input("Enter number : "))

    Ret = CalcSum(Value)
    print("Sum : ",Ret)


if __name__ == "__main__":
    main()