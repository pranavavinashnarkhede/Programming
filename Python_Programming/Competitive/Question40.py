'''
        write a lambda fucntion using reduce() which accepts a list of numbers and return the maximum element.
'''
from functools import reduce

maximum = lambda No1 , No2 :No1 if No1 > No2 else No2

def main():

    size = int(input("enter number of elements : "))

    value = list()

    for i in range(size):
        no = int(input("Enter element : "))
        value.append(no)

    Ret = reduce(maximum , value)

    print("Maximum element : ",Ret) 

if __name__ == "__main__":
    main()