/*
    write a program which accprt 2 strings from user and concat second string after first string.
    (Implement strcat() function).

    Input :     Marvellous Infosystems
                Logic Building
    Output :    Marvellous Infosystems Logic Building

*/

#include<stdio.h>

void StrCatX(char *src , char *dest)
{
    while(*src != '\0')
    {
        src++;
    }
    *src = ' ';                 // adds space between two string 
    src++;

    while(*dest != '\0')
    {
        *src = *dest ;
        src++;
        dest++;    
    }
    *dest = '\0';

}

int main()
{
    char Arr[60] = {'\0'};
    char Brr[30] = {'\0'};

    printf("Enter first string : ");
    scanf("%[^'\n']s",Arr);

    printf("Enter second string : ");
    scanf(" %[^'\n']s",Brr);

    StrCatX(Arr,Brr);

    printf("%s",Arr);

    return 0;
}