/*
    Write a program which accept one number and two position from user and check whether bit at first or bit at second position is ON or OFF.
    Input :     11      2       5      11 ->(1011)
    Output :    TRUE    

*/

#include<stdio.h>

#define TRUE 1                              
#define FALSE 0 

typedef unsigned int UINT ;
typedef int BOOL ;

BOOL ChkBit(UINT iNo , UINT iPos1 , UINT iPos2)
{
    UINT iMask1 = 1 ;
    UINT iMask2 = 1 ;
    UINT iMaskFinal = 0 ;
    UINT iAns = 0 ;

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1); 

    iMaskFinal = iMask1 | iMask2 ;
    
    iAns = iNo & iMaskFinal ; 

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
    UINT iLocation1 = 0 ;
    UINT iLocation2 = 0 ;
    BOOL bRet = FALSE ;    

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter first position : ");
    scanf("%d",&iLocation1);

    printf("Enter second position : ");
    scanf("%d",&iLocation2);

    bRet =ChkBit(iValue , iLocation1 , iLocation2);

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