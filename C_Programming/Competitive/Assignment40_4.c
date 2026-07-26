/*
    Write a recursive program which display below pattern.
    Input : 6
    Output : A B C D E F

*/

#include<stdio.h>

void Display(int iValue)
{   
    static char let = 'A';

    if(iValue != 0 )
    {
        printf("%c\t",let);
        let++ ;
        iValue--;

        Display(iValue);
    }
    
}


int main()
{
    int iValue = 0 ;

    printf("Enter any number : ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0 ;
}