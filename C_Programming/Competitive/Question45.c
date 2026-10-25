// write a program which accept number from user and return difference between summation of even digits and summation of odd digits.

#include<stdio.h>

int CountDiff(int iNo)
{
    int iEvenSum = 0;
    int iOddSum = 0;
    int iDigit = 0;
    int iDiff = 0;

    while(iNo > 0)
    {
        iDigit = iNo % 10 ;

        if((iDigit % 2) == 0)
        {
            iEvenSum += iDigit;
        }
        else
        {
            iOddSum += iDigit;
        }

        iNo = iNo / 10 ;
    }

    iDiff = iEvenSum - iOddSum;

    return iDiff;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d",iRet);

    return 0;
}

// Time Complexity : O(D)
// where D = number of digits