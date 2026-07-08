'''
        write a program which contains one lambda function which accepts two parameters and return its multiplication

        Input : 4   3 
        Output : 12
'''
mult = lambda No1 , No2 : No1 * No2 

def main():
    value1 = int(input("Enter first number : "))
    value2 = int(input("Enter second number : "))

    Data = list()
    Data.append(value1)
    Data.append(value2)

    Ret = mult(value1 , value2)

    print("Multiplication : ",Ret)

if __name__ == "__main__":
    main()