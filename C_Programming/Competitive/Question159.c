/*
    write a program which accept one number from user and toggle that bit . return modified number .


    Input :     10      3
    Output:     14
*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT ToggleBit(UINT iNo , int iPos)
{
    UINT iMaks = 0x1;
    UINT Ans = 0 ;

    iMaks = iMaks << (iPos - 1);

    Ans = iNo ^ iMaks;
    
    return Ans;
}

int main()
{
    UINT iValue = 0 ;
    UINT iLocation = 0 ;
    UINT iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter bit position : ");
    scanf("%d",&iLocation);

    iRet = ToggleBit(iValue , iLocation);

    printf("Modified number : %d",iRet);

    return 0 ;
}