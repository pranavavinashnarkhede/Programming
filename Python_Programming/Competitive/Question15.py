'''
        write a program which accepts one number and checks whether it is palindrome or not

        Input : 121
        Output : Palindrome
'''

def ChkPalindrome(No):
    rev = 0 
    digit = 0

    temp = No

    while (No != 0 ):
        digit = No % 10 
        rev = rev * 10 + digit
        No = No // 10 

    if temp == rev:
        return True
    else: 
        return False       
    

def main():
    Value = int(input("Enter number : "))
    Ret = ChkPalindrome(Value)

    if Ret == True:
        print("Number is Palindrome ")
    else:
        print("Number is not Palindrome")

if __name__ == "__main__":
    main()