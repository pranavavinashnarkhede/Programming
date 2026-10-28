/*   write a program which checks whether first and last bit is 
    ON or OFF . first bit means bit number 1 and last bit means 
    bit number 32 
*/


#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0;
    UINT Ans = 0 ;

    iMask = 0x80000001;

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