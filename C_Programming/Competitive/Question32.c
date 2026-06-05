// accept amount in US dollar and return its corresponding value in indian currency. consider 1$ as 70 rupees.

#include<stdio.h>

int DollarToINR(int iNo)
{ 
    return iNo * 70;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number in USD : ");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);

    printf("Value in INR is %d ",iRet);

    return 0;
}