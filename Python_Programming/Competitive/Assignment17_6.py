''' 
        write a program which accept one number and display below pattern.

        Input : 5
        Output : *  *   *   *   *
                 *  *   *   *
                 *  *   *
                 *  *
                 *
'''
def Pattern(No):

    for i in range(No+1 , 1 , -1):
        for j in range(1 , No+1):
            if i > j :
                print("*",end = " ")
        print()

def main():
    value = int(input("Enter number : "))

    Pattern(value)

if __name__ == "__main__":
    main()