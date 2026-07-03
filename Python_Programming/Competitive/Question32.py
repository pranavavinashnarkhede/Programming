'''
        write a lambda function which accepts one number and return True if divisible by 5
'''

ChkDivisible = lambda  No: True if No % 5 == 0 else False

def main():
    value = int(input("Enter number : "))

    Ret = ChkDivisibles(value)

    if Ret == True:
        print("True")
    else:
        print("False")

if __name__ == "__main__":
    main()