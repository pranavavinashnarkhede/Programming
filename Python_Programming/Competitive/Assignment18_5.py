'''
        write a program which accept N numbers from user and store it into list . return addition of all prime numbers from that list.
        main python file accepts N number sfrom user and pass each number to ChkPrime() function which is part of out user defined module named MarvellousNum. 
        Name of that function from main python file should be ListPrime().

        Input : Number of elements : 11
        Input Elements : 13 5   45  7   4   56  10  34  2   5   8
        Output : 32(13 + 5 + 7 + 2 + 5 )
'''
from MarvellousNum import ListPrime

def main():
    value = int(input("Enter number of elements : "))

    Data = list()

    for i in range(1 ,value+1):
        no = int(input(f"Element {i} element : "))
        Data.append(no)

    Ret = ListPrime(Data)

    print("Addition of prime numbers : ",Ret)

    
main()