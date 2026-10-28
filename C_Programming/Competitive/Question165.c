/*
    Write a program which accept one number from user and range of position from user . Toggle all bits from that range .
    Input :     897     9       13
    Output :    7297       

*/

#include<stdio.h>

typedef unsigned int UINT ;

UINT ToggleBitRange(UINT iNo , UINT iStart , UINT iEnd)
{
    UINT iMask = 0x0;
    UINT iAns = 0x1;
    UINT iCnt = 0 ;

    iAns = iAns << (iStart - 2);
 
    for(iCnt = iStart ; iCnt <= iEnd ; iCnt++)
    {
        iAns = iAns << 1;
        iMask = iAns | iMask ;
    }
    
    iAns = iNo ^ iMask ;

    return iAns;
}

int main()
{
    UINT iValue = 0 ;
    UINT iLocation1 = 0 ;
    UINT iLocation2 = 0 ;
    UINT iRet = 0 ;    

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter first position : ");
    scanf("%d",&iLocation1);

    printf("Enter second position : ");
    scanf("%d",&iLocation2);

    iRet =ToggleBitRange(iValue , iLocation1 , iLocation2);

    printf("Updated number : %u",iRet);

    return 0;
}