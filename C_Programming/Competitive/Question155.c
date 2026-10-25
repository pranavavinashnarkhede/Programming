/*
    write a program which accept one number from user and on its first 4 bits .Return modified number.

    Input :     73
    Output:     79
*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0x0 ;

    iMask = 0xf ;

    iNo = iNo | iMask;

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