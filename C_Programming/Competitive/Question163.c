/*
    Write a program which accept one number from user and check whether 9th or 12th bit is on or off.
    Input :     257
    Output :    TRUE

*/

#include<stdio.h>

#define TRUE 1                              // it tells compiler wheneven see TRUE replace it with 1
#define FALSE 0 

typedef unsigned int UINT ;
typedef int BOOL ;

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0 ;
    UINT iAns = 0 ;

    iMask = 0x900;

    iAns = iNo & iMask ; 

    if(iAns != 0)
    {
        return TRUE ;
    }
    else
    {
        return FALSE ;
    }
        
}

int main()
{
    UINT iValue = 0 ;
    BOOL bRet = FALSE ;    

    printf("Enter number : ");
    scanf("%u",&iValue);

    bRet =ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("Bit is ON");
    }
    else
    {
        printf("Bit is OFF");
    }

    return 0;
}