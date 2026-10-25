// write a program which accept distance in kilometre and convert it into meter.(i kilometre = 1000 meter)

#include<stdio.h>

int KMtoMeter(int iNo)
{
    int iResult = 0;
    
    iResult = iNo * 10000;

    return iResult;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter distance : ");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);

    printf("Distance in meters is %d",iRet);

    return 0;
}