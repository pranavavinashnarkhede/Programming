'''
        write a lambda function which accepts one number and return True if number if odd otherwise False
'''

ChkOdd = lambda  No: True if No % 2 == 1 else False

def main():
    value = int(input("Enter number : "))

    Ret = ChkOdd(value)

    if Ret == True:
        print("True")
    else:
        print("False")

if __name__ == "__main__":
    main()