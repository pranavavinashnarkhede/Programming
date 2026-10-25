'''
        write a lambda function using filter() which accepts a list of numbers and returns a list of even numbers.
'''

Even = lambda No :(No % 2 == 0)

def main():
    size = int(input("Enter number of elements : "))

    value = list()

    for i in range(size):
        No = int(input("enter elements : "))
        value.append(No)

    Ret = list(filter(Even , value))

    print(Ret)

if __name__ == "__main__":
    main()