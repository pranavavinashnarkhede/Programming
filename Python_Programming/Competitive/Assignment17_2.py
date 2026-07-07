'''
        write a program which accept one number and display below pattern

        Input : 5
        Output :    *  *   *  *   *  
                    *  *   *  *   *  
                    *  *   *  *   *  
                    *  *   *  *   *  
                    *  *   *  *   *  
'''

def pattern(No):

    for i in range(No):
        for j in range(No):
            print("*",end =" ")
        print()

def main():
    value = int(input("Enter number : "))
    
    pattern(value)

if __name__ == "__main__":
    main()