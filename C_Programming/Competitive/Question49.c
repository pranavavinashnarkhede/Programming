// write a program which accept temperature in fahrenheit and convert it into celsius.(i celsius = (fahrenheit - 32) *(5 / 9)).

#include<stdio.h>

double FhtoCs(int iTemp)
{
    double dResult = 0.0;

    dResult = (iTemp - 32)*(5.0 / 9.0);

    return dResult;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0 ;

    printf("Enter temperature in fahrenheit : ");
    scanf("%d",&iValue);

    dRet = FhtoCs(iValue);

    printf("%lf",dRet);

    return 0;
}