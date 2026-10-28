'''
        write a program which accepts one number and checks whether it is prime or not

        Input : 11
        Output  : Prime Number

'''

def ChkPrime(No):
    for i in range(2 , No):
        if No % i == 0 :
            return False
    
    return True

def main():
    Value = int(input("Enter number : "))
    Ret = ChkPrime(Value)

    if Ret == True:
        print("Prime Number")
    else:
        print("Not Prime Number")


if __name__ == "__main__":
    main()