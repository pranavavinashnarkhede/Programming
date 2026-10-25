// write a program which accept radius of circle from user and calculate its area.
// consider value of PI as 3.14 .(Area = PI *Radius * Radius)

#include<stdio.h>

# define PI 3.14                                    // user defined macro

double CircleArea(float fRadius)
{
    double dResult = 0.0;

    dResult = PI * fRadius * fRadius;               // preprocessor replace PI with 3.14
    
    return dResult;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0 ;

    printf("Enter radius : ");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("%lf",dRet);

    return 0;
}