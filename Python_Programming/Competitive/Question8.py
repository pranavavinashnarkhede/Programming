'''
     write a program which accepts one number and prints factorial of that number.

     Input : 5
     Output : 120   
'''

def CalcFactorial(No):
    fact = 1 
    for i in range(1 , No+1):
        fact = fact * i

    return fact 

def main():
    Value = int(input("Enter number : "))

    Ret = CalcFactorial(Value)
    print("Factorial : ",Ret)


if __name__ == "__main__":
    main()