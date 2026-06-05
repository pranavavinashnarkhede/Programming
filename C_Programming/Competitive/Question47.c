// write a program which accept widht & height of rectangle from user and calculate its area .(Area = width * height)

#include<stdio.h>

double RectArea(float fWidth , float fHeight)
{
    double dResult ;

    dResult = fWidth * fHeight;

    return dResult;
}

int main()
{
    float fValue1 = 0.0 ;
    float fValue2 = 0.0 ;
    double dRet = 0.0;

    printf("Enter widht : ");
    scanf("%f",&fValue1);

    printf("Enter height : ");
    scanf("%f",&fValue2);

    dRet = RectArea(fValue1 ,fValue2);

    printf("%lf",dRet);

    return 0;
}