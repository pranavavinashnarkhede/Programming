'''
       write a program which accepts one number and prints all odd numbers till that nnumber

       Input : 11
       Output : 1   3   5   7   9   11 
'''

def PrintOdd(No): 
    for i in range(1 , No+1 ,2):
        print(i)
     

def main():
    Value = int(input("Enter number : "))

    PrintOdd(Value)
    
if __name__ == "__main__":
    main()