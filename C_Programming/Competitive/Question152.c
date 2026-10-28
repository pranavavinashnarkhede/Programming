/*
    write a program which accept one number from user and off 7th and 10th bit 
    of that number  .Return modified number.

    Input :     577
    Output:     1
*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0x0 ;

    iMask = 0x240 ;

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