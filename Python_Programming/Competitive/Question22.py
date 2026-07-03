'''
        write a program which accepts radius of circle and prints area of circle

'''

def CalcArea(radius):
    return 3.14 * radius * radius

def main():
    value = int(input("Enter radius : "))
    Ret = CalcArea(value )

    print("Area of circle is : ",Ret)

if __name__ == "__main__":
    main()