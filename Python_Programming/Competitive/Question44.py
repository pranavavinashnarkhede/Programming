'''
        write a lambda function using reduce() which accepts a list of numbers and returns the product of all elements
'''
from functools import reduce

product = lambda No1 , No2 : No1 * No2

def main():
    size = int(input("Enter number of elements : "))

    numbers = list()

    for i in range(size):
        no = int(input("Enter element : "))
        numbers.append(no)

    Ret = reduce(product , numbers)

    print("Product of all elements : ",Ret)

if __name__ == "__main__":
    main()