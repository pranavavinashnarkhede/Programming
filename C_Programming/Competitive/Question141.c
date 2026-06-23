/*
    write a program which accept string from user and copy the contents of that
    string into another string .(Implement strcpy() function).

    Input :     Marvellous Multi OS
    Output :    Marvellous Multi OS             (in another string)

*/

#include<stdio.h>

void StrCpyX(char *src , char *dest)
{
    while(*src != '\0')
    {
        *dest = *src;
        src++;
        dest++;
    }

}

int main()
{
    char Arr[30] = {'\0'};
    char Brr[30] = {'\0'};

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    StrCpyX(Arr , Brr);
    
    printf("%s",Brr);

    return 0 ;
}