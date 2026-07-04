'''
        write a lambda fucntion using reduce() which accepts a list of numbers and return the minimum element.
'''
from functools import reduce

minimum = lambda No1 , No2 :No2 if No1 > No2 else No1

def main():

    size = int(input("enter number of elements : "))

    value = list()

    for i in range(size):
        no = int(input("Enter element : "))
        value.append(no)

    Ret = reduce(minimum , value)

    print("Minimum element : ",Ret) 

if __name__ == "__main__":
    main()