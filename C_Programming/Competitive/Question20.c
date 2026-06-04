// Write a program which accept number from user and return difference between summation of all its factors and non factors.

#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0 ;
    int iSumOfFactors = 0;
    int iSumOfNonFactors = 0;
    int iDiff = 0;

    for(iCnt = 1 ; iCnt < iNo ; iCnt++ )
    {
        if((iNo % iCnt ) != 0)
        {
            iSumOfNonFactors = iSumOfNonFactors + iCnt;
        }
        else
        {
            iSumOfFactors = iSumOfFactors + iCnt;
        }
    }

    iDiff = iSumOfFactors - iSumOfNonFactors;
    return iDiff;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d",iRet);

    return 0;
}