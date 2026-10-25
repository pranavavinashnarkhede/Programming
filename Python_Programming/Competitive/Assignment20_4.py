import threading 

def CountSmall(data):
    count = 0 

    for i in range(len(data)):
        if data[i] >= "a" and data[i] <= "z":
            count = count + 1

    print("Thread Id : ",threading.get_ident())
    print("Thread Name : ",threading.current_thread().name)
    print("Number of lowercase characters : ",count)


def CountCapital(data):
    count = 0 

    for i in range(len(data)):
        if data[i] >= "A" and data[i] <= "Z":
            count = count + 1

    print("Thread Id : ",threading.get_ident())
    print("Thread Name : ",threading.current_thread().name)
    print("Number of uppercase characters : ",count)

def CountDigits(data):
    count = 0 

    for i in range(len(data)):
        if data[i] >= "0" and data[i] <= "9":
            count = count + 1

    print("Thread Id : ",threading.get_ident())
    print("Thread Name : ",threading.current_thread().name)
    print("Number of numeric digits  : ",count)


def main():
    value = input("Enter string : ")

    Small = threading.Thread(target = CountSmall , args = (value ,))
    Capital = threading.Thread(target = CountCapital , args = (value ,))
    Digits = threading.Thread(target = CountDigits , args = (value ,))

    Small.start()
    Capital.start()
    Digits.start()

    Small.join()
    Capital.join()
    Digits.join()

if __name__ == "__main__":
    main()