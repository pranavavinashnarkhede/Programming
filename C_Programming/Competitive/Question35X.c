// write a program which returns difference between even factorial and odd factorial of given number.

#include<stdio.h>

int  FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iEvenFactDiff = 1 ;
    int iOddFactDiff = 1 ;
    int iDiff = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        
        if(iCnt % 2 == 0)
        {
            iEvenFactDiff = iEvenFactDiff *iCnt;
        }
        else
        {
            iOddFactDiff = iOddFactDiff *iCnt;
        }

    }

    iDiff = iEvenFactDiff - iOddFactDiff;

    return iDiff;

}

int main()
{
    int iValue = 0;
    int iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial difference is  %d ",iRet);

    return 0;
}

// Time complexity : O(N)
