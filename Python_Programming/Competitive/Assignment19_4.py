'''
        write a program which contains filter() , map() , reduce() in it . python application which contains one list of numbers. List contains the numbers which are accepted from user. 
        Filter should filter out all such numbers which are even . map function will calculate its square . reduce will return addition.

        List after filter :  [2, 4, 4, 2, 8, 10]
        List after map :  [4, 16, 16, 4, 64, 100]
        Output of reduce :  204
'''
from functools import reduce

even = lambda No : No % 2 == 0

square = lambda No : No * No

addition = lambda No1 ,No2 : No1 + No2

def main():
    Data = list()

    size = int(input("Enter number of elements : "))

    for i in range(1 , size+1):
        no = int(input(f"Enter {i} element : "))
        Data.append(no)

    Ret = list(filter(even , Data))
    print("List after filter : ",Ret)

    Ret = list(map(square , Ret))
    print("List after map : ",Ret)

    Ret = reduce(addition , Ret)
    print("Output of reduce : ",Ret)

if __name__ == "__main__":
    main()

    
