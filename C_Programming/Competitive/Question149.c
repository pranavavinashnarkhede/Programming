//   write a program which checks whether 7th & 8th & 9th bit is On or OFF

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0;
    UINT Ans = 0 ;

    iMask = 0x1c0;

    Ans = iNo & iMask ;

    if(Ans == iMask)
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
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf(" bit is ON");
    }
    else
    {
        printf(" bit is OFF");
    }

    return 0;
}