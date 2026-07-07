'''
        write a program which accept one number from user and return its factorial.

        Input : 5
        Output : 120
'''
def CalcFact(No):
    fact = 1 

    for i in range(1, No+1 ):
        fact = fact * i

    return fact

def main():
    value = int(input("Enter number : "))

    Ret = CalcFact(value)

    print("Factorial is : ",Ret)

if __name__ == "__main__":
    main()