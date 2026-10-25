/*
    write a program which accept one number from user and toggle  contents of first and last nibble of that number . 
    return modified number .(Nibble is a group of four bits)

*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT ToggleBit(UINT iNo )
{
    UINT iMaks = 0xF000000F;
    UINT Ans = 0 ;

    Ans = iNo ^ iMaks;

    return Ans;
}

int main()
{
    UINT iValue = 0 ;
    UINT iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified number : %u",iRet);

    return 0 ;
}