'''
        write a program which contains one lambda function which accepts one parameter and return power of two.

        Input : 4
        Output : 14
'''
def CalcPower(No):
    return No * No

def main():
    number = int(input("Enter Number : "))

    Ret = CalcPower(number)

    print(f"Power of {number} : ",Ret)

if __name__ == "__main__":
    main()