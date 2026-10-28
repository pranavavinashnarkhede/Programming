'''
        write a lambda function which accepts one number and return True if number is even otherwise False.
'''

ChkEven = lambda  No: True if No % 2 == 0 else False

def main():
    value = int(input("Enter number : "))

    Ret = ChkEven(value)

    if Ret == True:
        print("True")
    else:
        print("False")

if __name__ == "__main__":
    main()