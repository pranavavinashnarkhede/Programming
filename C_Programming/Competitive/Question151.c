/*
    write a program which accept one number from user and off 7th bit 
    of that number if it is on .Return modified number.

    Input :     79
    Output:     15
*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0x0 ;

    iMask = 0x40 ;

    iNo = iNo ^ iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0 ;
    UINT iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = OffBit(iValue);

    printf("Modified number : %d",iRet);

    return 0 ;
}