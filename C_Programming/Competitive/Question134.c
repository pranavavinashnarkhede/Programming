/*
    write a program which accept string from user and display only digits from that string  .

    Input :     marve89llous123
    Output :    89123

*/

#include<stdio.h>

void DisplayDigit(char *str)
{
    while(*str != '\0')
    {
        if(*str >= '0' && *str <= '9')
        {
            printf("%c",*str);
        }
        str++;
    }
}

int main()
{
    char Arr[20] = {'\0'};

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    DisplayDigit(Arr);
}