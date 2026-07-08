'''
        write a program which contains filter() , map(), reduce() in it . python application which contains one list of numbers. list contains the numbers which are accepted from user .
        filter should filter out all prime numbers. map function will multiply each number by 2 . reduce will return maximum number from that numbers.

        List after filter :  [2, 11, 17, 23, 31]
        List after map :  [4, 22, 34, 46, 62]
        Output of reduce :  62
'''

from functools import reduce

def ChkPrime(No):
    for i in range(2 , No):
        if No % i == 0 :
            return False
    return True

def Mult(No):
    return No * 2

def FindMax(No1 , No2):
    if No1 > No2 :
        return No1
    else:
        return No2

def main():
    Data = list()

    size = int(input("Enter the size of elements : "))

    for i in range (1 , size+1):
        no = int(input(f"Enter {i} element : "))
        Data.append(no)

    Ret = list(filter(ChkPrime , Data))
    print("List after filter : ",Ret)

    Ret = list(map(Mult , Ret))
    print("List after map : ",Ret)

    Ret = reduce(FindMax , Ret)
    print("Output of reduce : ",Ret)
    

if __name__ == "__main__":
    main()