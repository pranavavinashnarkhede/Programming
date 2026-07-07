'''
        write a program which accept N numbers from user and store it into list . Return minimum number from that list .

        Input : Number of elements : 7
        Input Elements : 13     5   45  7   4   56  34
        Output : 4

'''

from functools import reduce

Find_Min = lambda No1 , No2: No2 if No1 > No2 else No1

def main():
    elements = int(input("Enter number of elements : "))

    Data = list()

    for i in range(1 , elements+1):
        no = int(input(f"Enter {i} element :"))
        Data.append(no)

    Ret = reduce(Find_Min , Data)

    print("Minimum Number is : ",Ret)


if __name__ == "__main__":
    main()