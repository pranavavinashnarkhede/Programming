"""
        write a program which accept one number and prints cube of that number. 
"""

def CalcCube(No):
    return No*No*No

def main():
    Value = int(input("Enter number : "))
    Ret = CalcCube(Value)
    print("Cube : ",Ret)
    
if __name__ == "__main__":
    main()