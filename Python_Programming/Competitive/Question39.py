'''
        write a lambda function using reduce() which accepts a list of numbers and return the addition of all elements
'''
from functools import reduce 

Add = lambda No1 , No2 : No1 + No2

def main():
    size = int(input("Enter number of elements : "))

    value = list()

    for i in range(size):
        No = int(input("enter elements : "))
        value.append(No)

    Ret = reduce(Add , value)

    print(Ret)

if __name__ == "__main__":
    main()