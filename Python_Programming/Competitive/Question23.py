'''
       write a program which accepts one number and checks whether it is perfect number of not

       Input : 6
       Output : Perfect Number 

'''

def ChkPerfect(No):
    sum = 0 

    for i in range (1 , No):
        if (No % i == 0):
            sum = sum + i

    if sum == No :
        return True
    else:
        return False

def main():
    Value = int(input("Enter number : "))

    Ret = ChkPerfect(Value)

    if Ret == True:
        print("Number is perfect")
    else:
        print("Number is not perfect")

if __name__ == "__main__":
    main()