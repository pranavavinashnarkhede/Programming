// Program to divide two numbers

#include<iostream>
using namespace std ;

int Divide(int iNo1 ,int iNo2)
{
    int iDivide = 0 ;

    if(iNo2 == 0)
    {
        cout<<"Cannot Divide by 0";
    }
    else
    {
        iDivide = iNo1 / iNo2 ;
       
    }

    return iDivide;
    


}

int main()
{
    int iValue1 = 0 , iValue2 = 0 ;
    int iRet = 0 ;

    cout<<"Enter first number : ";
    cin>>iValue1;

    cout<<"Enter second number : ";
    cin>>iValue2;

    iRet = Divide(iValue1 , iValue2);

    cout<<"The division is : "<<iRet;

    return 0 ;

}