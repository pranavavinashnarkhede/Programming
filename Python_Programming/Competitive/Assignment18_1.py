'''
        write a program which accept N numbers from user and store it into list. Return addition of all elements form that list.

        Input : Number of elements : 6
        Input Element : 13  5   45  7   4   56
        Output : 130
'''

def Add(No):

    sum = 0 
    for i in No:
        sum = sum + i 
    
    return sum


def main():
    value = int(input("Enter number of elements : "))
    Data = list()

    for i in range(1 ,value+1):
        no = int(input(f"Enter {i} element :  "))
        Data.append(no)

    Ret = Add(Data)

    print("Addition is : ",Ret)

if __name__ == "__main__":
    main()