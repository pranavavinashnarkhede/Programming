'''
        write a program which accepts one number and prints multiplication table of that number

        Input : 4
        Output : 4  8   12  16  20  24  28  32  36  40
'''

def PrintTable(No):
    for i in range(4 , 41 , 4):
        print(i,"\t")

def main():
    Value = int(input("Enter number : "))

    PrintTable(Value)

if __name__ == "__main__":
    main()