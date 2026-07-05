'''
        write a program which contains one function named as ChkNum() which accepts one paramenter as number. if number is even then it should display "Even Number" otherwise display "Odd Number" on console

'''
ChkNum = lambda No : True if No % 2 == 0 else False

def main():
    value = int(input("Enter number : "))

    Ret = ChkNum(value)

    if Ret == True:
        print("Number is Even")
    else:
        print("Number is Odd")

if __name__ == "__main__":
    main()