'''
    create an module named as Arithmetic which contains 4 functions as Add() , Sub() , Mult() , Div() . 
    All functions accepts two parameters as number and perform the operation.write a python program 
    which call all the functions from Arithmetic module by accepting the parameters from user. 
'''

from Arithmetic import * 

def main():
    value1 = int(input("Enter first number : "))
    value2 = int(input("Enter second numbe : "))

    Ret = Add(value1 , value2)
    print("Addition : ",Ret)

    Ret = Sub(value1 , value2)
    print("Substraction : ",Ret)

    Ret = Mult(value1 , value2)
    print("Multiplication : ",Ret)

    Ret = Div(value1 , value2)
    print("Division : ",Ret)

if __name__ == "__main__":
    main()