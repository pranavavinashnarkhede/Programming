/*
    Write a recursive program which accept number from user and return its
    reverse number.
    Input : 523
    Output : 325
*/

#include<stdio.h>

void Reverse(int iNo)
{
    static int iMin = 9 ;
    int iDigit = 0 ;

    if(iNo != 0)
    {
        iDigit = iNo % 10 ;
        
        printf("%d",iDigit);

        iNo = iNo / 10 ;

        Reverse(iNo);
    }

}

int main()
{
    int iValue = 0 ;
    int iRet = 0 ;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Reverse(iValue);

    return 0 ;
}