'''
      write a program which accepts one number and prints reverse of that number

      Input : 123
      Output : 321  
'''

def RevNumber(No):
    rev = 0 
    digit = 0   

    while (No != 0 ):
        digit = No % 10 
        rev = rev * 10 + digit
        No = No // 10 
           
    return rev

def main():
    Value = int(input("Enter number : "))
    Ret = RevNumber(Value)

    print("Reverse number : ",Ret)

if __name__ == "__main__":
    main()