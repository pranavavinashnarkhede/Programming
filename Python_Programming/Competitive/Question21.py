'''
        write a program which accepts length and width of rectange and prints area
'''

def CalcArea(length , width):
    return length * width

def main():
    value1 = int(input("Enter length : "))
    value2 = int(input("Enter width : "))

    Ret = CalcArea(value1 , value2)

    print("Area of rectangle is : ",Ret)

if __name__ == "__main__":
    main()