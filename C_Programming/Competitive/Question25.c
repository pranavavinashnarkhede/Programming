// write a program which accept N and print first 5 multiples of N.

#include<stdio.h>

void MultipleDisplay(int iNo)
{
    int iCnt = 0;
    int iRet = 0;

    for(iCnt = 1 ; iCnt <= 5 ; iCnt++)
    {
        iRet = iNo * iCnt ;

        printf("%d  ",iRet);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);

    return 0;
}

// Time complexity : O(1)


