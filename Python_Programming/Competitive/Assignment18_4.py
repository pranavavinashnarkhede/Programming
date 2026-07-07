'''
        write a program which accept N numbers from user and store it into list. accept one another number from user and return frequency of that number from list.

        Input : Number of elements : 11
        Input Elements : 13   5     45  7   4   56  5   34  2   5   65
        Element to search : 5
        Output : 3
'''

def Find_frequency(data , No):
    Count = 0 

    for i in data:
        if No == i :
            Count = Count + 1

    return Count


def main():
    elements = int(input("Enter number of elements : "))

    Data = list()

    for i in range(1 , elements+1):
        no = int(input(f"Enter {i} element :"))
        Data.append(no)
    
    key = int(input("Enter number to search : "))

    Ret = Find_frequency(Data , key)

    print(f"Frequency of {key } is : ",Ret)


if __name__ == "__main__":
    main()