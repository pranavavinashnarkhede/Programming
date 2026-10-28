/*
    write a program which accept string from user and copy small characters of that
    string into another string.

    Input :     Marvellous multi OS
    output :    arvellous multi
*/

#include<stdio.h>

void StrCpySmall(char *src , char *dest)
{
    while(*src != '\0')
    {
        if((*src >= 'a') && (*src <= 'z')||(*src == ' '))
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

    StrCpySmall(Arr,Brr);

    printf("%s",Brr);

    return 0;
}