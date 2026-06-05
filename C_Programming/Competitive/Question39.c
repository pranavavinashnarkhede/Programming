// write a program which accept temperature in fahrenheit and convert it into celsius.(i celsius = (fahrenheit - 32) *(5/9))

#include<stdio.h>

double FhtoCs(float fTemp)
{
    double dResult = 0.0;

    dResult = ((fTemp - 32) *(5.0 / 9.0));

    return dResult;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0 ;

    printf("Enter temperature in fahrenheit : ");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("Temperature in celsius is %lf ",dRet);

    return 0;
}