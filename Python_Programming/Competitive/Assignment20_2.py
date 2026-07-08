import threading

def SumEvenFactors(No):
    SumEven = 0 

    for i in range (2 , No+1 , 2):
        if No % i == 0 :
            SumEven = SumEven + i

    print(f"Sum of Even Factors of {No} : ",SumEven)

def SumOddFactors(No):
    SumOdd = 0 

    for i in range (1 , No+1 , 2):
        if No % i == 0 :
            SumOdd = SumOdd + i

    print(f"Sum of Odd Factors of {No} : ",SumOdd)


def main():
    value = int(input("Enter number : "))

    EvenFactor = threading.Thread(target = SumEvenFactors , args = (value ,))
    OddFactor = threading.Thread(target = SumOddFactors , args = (value ,))

    EvenFactor.start()
    OddFactor.start()

    EvenFactor.join()
    OddFactor.join()

    print("Exit from main")

if __name__ == "__main__":
    main()