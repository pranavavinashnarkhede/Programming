// write a program which accept area in square feet and convert it into square meter .(i square feet = 0.0929 square meter)

#include<stdio.h>

double SquareMeter(int iValue)
{
    double dResult ;

    dResult = iValue *0.0929 ;

    return dResult;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meters is %lf",dRet);

    return 0;
}