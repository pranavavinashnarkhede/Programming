''' 
    write a program which accept number from user and check whether that number is positive or negative or zero.

'''

def ChkNum(No):
    if No > 0:
        return 1
    elif No < 0 :
        return -1
    else:
        return 0

def main():
    value = int(input("Enter numbe : "))

    Ret = ChkNum(value)

    if Ret == 1:
        print("Positive Number")
    elif Ret == -1:
        print("negative Number")
    else:
        print("Zero")

if __name__ == "__main__":
    main()