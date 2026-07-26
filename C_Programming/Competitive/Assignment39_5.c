/*
    Write a recursive program which display below pattern.
    Output : a b c d e f
*/

#include<stdio.h>

void Display(char cValue)
{   
    static char let = 'a';

    if(cValue >= 'A' && cValue <= 'Z')
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