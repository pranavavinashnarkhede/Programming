'''
        write a program which accepts one number and check whether it is divisible by 3 and 5

        Input : 15
        Output : Divisible by 3 and 5
'''

def ChkDivisible(No):
    if(No % 3 == 0 and No % 5 == 0):
        return True
    else:
        return False

def main():
    Value = int(input("Enter number : "))
    Ret = ChkDivisible(Value)

    if Ret == True:
        print("Divisible by 3 and 5")

    else:
        print("Not Divisible by 3 and 5")
    
if __name__ == "__main__":
    main()