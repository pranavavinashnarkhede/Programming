import threading 

def EvenSum(No):
    Sum = 0 

    for value in No:
        if value % 2 == 0 :
            Sum = Sum + value
    
    print("Sum of Even Elements : ",Sum)

def OddSum(No):
    Sum = 0 

    for value in No:
        if value % 2 == 1 :
            Sum = Sum + value
    
    print("Sum of Odd Elements : ",Sum)


def main():
    Data = list()

    size = int(input("Enter the number of elements : "))

    for i in range(1 , size+1):
        no = int(input(f"Enter {i} element : "))
        Data.append(no)

    EvenList = threading.Thread(target = EvenSum , args = (Data,))
    OddList = threading.Thread(target = OddSum , args = (Data ,))

    EvenList.start()
    OddList.start() 

if __name__ == "__main__":
    main()