/*
    Write a recursive program which display below pattern.
    Output : A B C D E F
*/

#include<stdio.h>

void Display(char cValue)
{   
    static char let = 'A';

    if(cValue >= 'a' && cValue <= 'z')
    {
        return ;
    }

    if(let <= cValue)
    {
        printf("%c\t",let);
        let++ ;

        Display(cValue);
    }
    
}


int main()
{
    char cValue = 0 ;

    printf("Enter any character : ");
    scanf("%c",&cValue);

    Display(cValue);

    return 0 ;
}