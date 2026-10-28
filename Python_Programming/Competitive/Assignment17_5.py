'''
        write a program which accept one number from user and check whetheer number is prime or not.

        Input : 5
        Output : it is prime number
'''
def ChkPrime(No):

    for i in range(2 , No):
        if No % i == 0 :
            return False
    
    return True

def main():
    value = int(input("Enter number : "))

    Ret = ChkPrime(value)

    if Ret == True:
        print("It is Prime Number ")
    else :
        print("It is not Prime Number")

if __name__ == "__main__":
    main()