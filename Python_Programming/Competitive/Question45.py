'''
        write a lambda function using filter() which accepts a list of numbers and returns the count of even numbers.
'''

CntEven = lambda No :  No % 2 == 0  
        
def main():
    size = int(input("Enter number of elements : "))

    numbers = list()

    for i in range(size):
        no = int(input("Enter element "))
        numbers.append(no)
    
    Ret = list(filter(CntEven , numbers))

    print("Count of even numbers : ",len(Ret))

if __name__ == "__main__":
    main()