// Accept one number from user and print that number of * on screen.

#include<iostream>
using namespace std;

void Print(int iNo)
{
    int iCnt = 0 ;

    for(iCnt = 0 ; iCnt < iNo ; iCnt++)
    {
        cout<<"*\t";
    }
}

int main()
{
    int iValue = 0 ;

    cout<<"Enter number : ";
    cin>>iValue;

    Print(iValue);
}