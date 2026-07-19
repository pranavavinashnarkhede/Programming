/*
    Write a program which accept one number from user and count number of ON(1) bits in it without using % and / operator.
    
    Input :     11
    Output :    3

*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT CountOne(UINT iNo)
{
    UINT iCount = 0 ;
    UINT iCnt = 0 ;
    UINT iMaks = 0x1;
    UINT iAns = 0 ;

    for(iCnt = 1 ; iCnt <= 32 ; iCnt++ , iMaks = iMaks << 1)
    {
        iAns = iNo & iMaks;
        
        if(iAns == iMaks)
        {
            iCount++;
        }
    }

    return iCount;
    
}

int main()
{
    UINT iValue = 0 ;
    UINT iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = CountOne(iValue);

    printf("Number of 1's : %d",iRet);

    return 0;
}