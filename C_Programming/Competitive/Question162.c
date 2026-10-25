/*
    Write a program which accept two number from user and display position of common ON bits from that two numbers . 
    Input :     11
    Output :    3

*/

#include<stdio.h>

typedef unsigned int UINT ;

void CommonBits(UINT iNo1 , UINT iNo2)
{
    UINT iMask = 0x1;
    UINT iCnt = 0 ;
    UINT iAns1 = 0 ;
    UINT iAns2 = 0 ;
    UINT iAnsFinal = 0 ;
    
    for(iCnt = 1 ; iCnt <= 32 ; iCnt++)
    {
        iAns1 = iNo1 & iMask ;

        iAns2 = iNo2 & iMask ;

        iAnsFinal = iAns1 & iAns2 ; 

        if(iAnsFinal == iMask)
        {
            printf("%d\t",iCnt);
        }

        iMask = iMask << 1 ;
    }
        
}

int main()
{
    UINT iValue1 = 0 ;
    UINT iValue2 = 0 ;

    printf("Enter first number : ");
    scanf("%d",&iValue1);

    printf("Enter second number : ");
    scanf("%d",&iValue2);

    CommonBits(iValue1 , iValue2);

    return 0;
}