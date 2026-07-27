/*
    Write a recursive program which accept number from user and return
    summation of its digits.
    Input : 879
    Output : 24
*/

#include<stdio.h>

int Sum(int iValue)
{
    static int iSum = 0 ;
    int iDigit = 0 ;

    if(iValue != 0)
    {
        iDigit = iValue % 10 ;
        iSum = iSum + iDigit ;
        
        iValue = iValue / 10 ;

        Sum(iValue);
    }
    return iSum;
}

int main()
{
    int iValue = 0 ;
    int iRet = 0 ;
    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Sum(iValue);

    printf("Result is : %d\n",iRet);

    return 0 ;
}