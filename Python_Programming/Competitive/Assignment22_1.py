'''
        write a program that accepts a list of integers and uses Pool.map() to calculate the sum of squares from 1 to N for every element in the list.

        input : [1000000,2000000,3000000,4000000]
'''

import multiprocessing

def SumOfSquare(Num):
    total = 0 

    for i in range(1 , Num+1):
        total = total + i*i
    
    return total

def main():
    Data = list()

    size = int(input("Enter number of elements : "))

    for i in range(1 , size+1):
        no = int(input(f"Enter {i} element : "))
        Data.append(no)

    pobj = multiprocessing.Pool()
    
    Ret = list(pobj.map(SumOfSquare ,Data))

    pobj.close()
    pobj.join()


    print(Ret)

if __name__ == "__main__":
    main()