'''
        write a program which accept one number from user and return addition of its factors

        Input : 12
        Output : 16  (1+2+3+4+6)
'''
def SumOfFact(No):
    
    sum = 0 

    for i in range(1 ,No):
        if No % i == 0:
            sum = sum + i
    
    return sum


def main():
    value = int(input("Enter number : "))

    Ret = SumOfFact(value)

    print("Sum of factors : ",Ret)

if __name__ == "__main__":
    main()