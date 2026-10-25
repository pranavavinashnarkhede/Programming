// write a program which accept area in square feet and convert it into square meter.(1 square feet = 0.0929 square meter)

#include<stdio.h>

double Squaremeter(int iNo)
{
    double dResult = 0.0;

    dResult = iNo * 0.0929 ;

    return dResult;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = Squaremeter(iValue);

    printf("%lf",dRet);

    return 0;
}
