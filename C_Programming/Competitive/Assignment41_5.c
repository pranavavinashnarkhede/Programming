/*
    Write a recursive program which accept number from user and return its
    product of digits.
    Input : 523
    Output : 30
*/

#include<stdio.h>

int Mult(int iNo)
{
    static int iMult = 1 ;
    int iDigit = 0 ;
    if(iNo != 0 )
    {
        iDigit = iNo % 10 ;

        iMult = iMult * iDigit ;
        iNo = iNo / 10 ;

        Mult(iNo);
    }
    return iMult ;
}

int main()
{
    int iValue = 0 ;
    int iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("Result is : %d\n",iRet);

    return 0 ;
}