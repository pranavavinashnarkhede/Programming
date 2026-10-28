/*
    write a program which accept string from user and copy capital characters of that string into another string.

    Input :     Marvellous Multi OS
    Output :    MMOS
*/

#include<stdio.h>

void StrCpyCap(char *src , char *dest)
{
    while(*src != '\0')
    {
        if((*src >= 'A') && (*src <= 'Z'))
        {
            *dest = *src;
            dest++;
        }
        src++;
    }
}

int main()
{
    char Arr[30] = {'\0'};
    char Brr[30] = {'\0'};

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    StrCpyCap(Arr,Brr);

    printf("%s",Brr);

    return 0;
}