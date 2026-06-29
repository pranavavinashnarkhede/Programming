/*
    write a program which accept one number from user and check whether bit at that position is on 
    or off . if bit is one return TRUE otherwise return FALSE.

    Input :     10      2
    Output:     TRUE
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0 

typedef unsigned int UINT ;
typedef int BOOL ;

BOOL ChkBit(UINT iNo , int iPos)
{
    UINT iMaks = 0x1;
    UINT Ans = 0 ;

    iMaks = iMaks<<(iPos - 1);

    Ans = iNo & iMaks ;

    if(Ans == iMaks)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }

}

int main()
{
    UINT iValue = 0 ;
    UINT iLocation = 0 ;
    BOOL bRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter bit position : ");
    scanf("%d",&iLocation);


    bRet = ChkBit(iValue, iLocation);

    if(bRet == TRUE)
    {
        printf("Bit is ON");
    } 
    else
    {
        printf("Bit is OFF");
    }   

    return 0 ;
}