'''
        write a lambda function using filter() which accepts a list of numbers and return a list of odd numbers.     
'''

Odd = lambda No :(No % 2 == 1)

def main():
    size = int(input("Enter number of elements : "))

    value = list()

    for i in range(size):
        No = int(input("enter elements : "))
        value.append(No)

    Ret = list(filter(Odd , value))

    print(Ret)

if __name__ == "__main__":
    main()