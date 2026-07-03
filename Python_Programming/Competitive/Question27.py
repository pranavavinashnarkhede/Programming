'''
    write a lambda function which accepts one number and returns cube of that number.

'''

CalcCube = lambda No : No * No * No

def main():
    value = int(input("Enter number : "))

    Ret = CalcCube(value)

    print("Cube : ",Ret)

if __name__ == "__main__":
    main()