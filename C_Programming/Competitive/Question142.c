/*
    write a program which accept string from user and copy the content of that 
    string into another string . (Implement strncpy() function).

    Input :     Marvellous Multi OS
                10

    Output :    Marvellous
*/

#include<stdio.h>

void StrNCpyX(char *src , char *dest , int iSize)
{
    while((*src != '\0') && (iSize != 0))
    {
        *dest = *src;
        src++;
        dest++;
        iSize--;
    }
}

int main()
{
    char Arr[30] = {'\0'};
    char Brr[30] = {'\0'};
    int iLenght = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    printf("Enter lenght : ");
    scanf("%d",&iLenght);

    StrNCpyX(Arr,Brr,iLenght);

    printf("%s",Brr);

    return 0;
}