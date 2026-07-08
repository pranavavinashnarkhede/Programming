import threading

def PrintEven(No):
    print("Even Numbers : ")
    for num in range(2 , No+1 , 2):
        print(num)

def PrintOdd(No):
    print("Odd Numbers : ")
    for num in range(1 , No, 2):
        print(num)

def main():

    t1 = threading.Thread(target = PrintEven , args = (20,))
    t2 = threading.Thread(target = PrintOdd , args = (20,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

if __name__ == "__main__":
    main()