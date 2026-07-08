'''
    write a program which contains filter() , map() and reduce() in it . Python application which contains one list of numbers. list contains the numbers which are accepted from user.
    filter should filter out all such numbers which greater than or equal to 70 and less than or equal to 90 . Map function will increase each number by 10 . Reduce will return product of all the numbers.

    Input List = [4 , 34,36,76,68,24,89,23,86,90,45,70]
    List after filter = [76,89,86,90,70]
    List after map = [86,99,96,100,80]
    output of reduce = 6538752000
'''

from functools import reduce

filt = lambda No : No >= 70 and No <= 90 

update = lambda No : No + 10

mult = lambda No1 , No2 : No1 * No2

def main():
    Data = list()

    size = int(input("Enter number of elements : "))

    for i in range(1 , size+1):
        no = int(input(f"Enter {i} elements : "))
        Data.append(no)

    Ret = list(filter(filt , Data))
    print("List after Filter : ",Ret)

    Ret = list(map(update , Ret))
    print("List after map : ",Ret)

    Ret = reduce(mult , Ret)
    print("Output after reduce : ",Ret)    
    
if __name__ == "__main__":
    main()
