'''
        write a program which contains one function named as ChkNum() which accepts one paramenter as number. if number is even then it should display "Even Number" otherwise display "Odd Number" on console

'''
def ChkNum(No):
    if No % 2 == 0:
        return True
    else:
        return False

def main():
    value = int(input("Enter number : "))

    Ret = ChkNum(value)

    if Ret == True:
        print("Number is Even")
    else:
        print("Number is Odd")

if __name__ == "__main__":
    main()