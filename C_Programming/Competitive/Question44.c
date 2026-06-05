// write a program which accept number from user and return multiplication of all digits.

#include<stdio.h>

int MultDigits(int iNo)
{
    int iMul = 1;
    int iDigit = 0;

    while(iNo > 0)
    {
        iDigit = iNo % 10 ;
        iMul *= iDigit ;
        iNo = iNo / 10;
    }

    return iMul;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = MultDigits(iValue);

    printf("%d",iRet);

    return 0;
}

// Time Complexity : O(D)
// where D = number of digits