// Accept one number and check whether is is divisible by 5 or not.

#include<iostream>
using namespace std ;

bool checkDivisible(int iNo)
{
    if((iNo % 5) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iValue = 0 ;
    bool bRet = false ;

    cout<<"Enter number : ";
    cin>>iValue;

    bRet = checkDivisible(iValue);

    if(bRet == true)
    {
        cout<<"Number is divisible by 5";
    }
    else
    {
        cout<<"Number is not divisible by 5";
    }

    return 0 ;
}