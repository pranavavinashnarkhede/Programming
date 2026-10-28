import threading

def DisplayForward(No):
    for i in range(1 , No+1):
        print(i)

    print()
    print()

def DisplayBackward(No):
    for i in range(No , 0, -1):
        print(i)



def main():

    Thread1 = threading.Thread(target = DisplayForward , args = (50 , ))
    Thread2 = threading.Thread(target = DisplayBackward , args = (50 , ))

    Thread1.start()
    Thread1.join()

    Thread2.start()
    Thread2.join()

if __name__ == "__main__":
    main()