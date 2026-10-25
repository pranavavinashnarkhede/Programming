'''
        write a program which accepts one number and prints binary equivalent
'''

def DisplayBinary(No):
    print(bin(No)[2:])      # if we remove square bracket it will add 0b at start of binary.

def main():
    Value = int(input("Enter number : "))
    DisplayBinary(Value)

if __name__ == "__main__":
    main()