'''
        write a program which contains one function that accept one number from user and return true if number is divisible by 5 otherwise return false
'''

def ChkDivisible(No):
    if No % 5 == 0:
        return True
    else:
        return False

def main():

    value = int(input("Enter number : "))

    Ret = ChkDivisible(value)

    print(Ret)

if __name__ == "__main__":
    main()