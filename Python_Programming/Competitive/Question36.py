'''
        write a lambda function using map() which accepts a list of numbers and return a list of square of each number.
'''

ToSquare = lambda No : No * No
    

def main():
    
    size = int((input("Enter number of  elements : ")))

    value = list()

    for i in range(size):
        No = int(input())
        value.append(No)

    Ret = list(map(ToSquare , value))
    print(Ret)

if __name__ == "__main__":
    main()