'''
        write a lambda function using filter() which accepts a list of numbers and return a list of numbers divisible by 3 and 5
'''

ChkDivisible = lambda No : No % 3 == 0 and No % 5 == 0

def main():

    size = int(input("Enter number of elements : "))

    numbers = list()

    for i in range(size):
        No = int(input("Enter element : "))
        numbers.append(No)

    Ret = list(filter(ChkDivisible , numbers))

    print(Ret)

if __name__ == "__main__":
    main()