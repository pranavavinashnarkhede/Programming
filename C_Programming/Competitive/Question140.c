/*
    write a program which accept string from user and reverse that string in place.

    Input :     abcd
    Output :    dcba
    
*/

#include<stdio.h>

void StrRevX(char *str)
{
    char *start = NULL;
    char *end = NULL ;
    char temp = '\0';

    start = str;                    // assigning base address of array to start

    while(*str != '\0')
    {
        str++;
    }
    str--;
    end = str;                  // assigning last address before '\0' to the end.

    while(start < end)
    {
        temp = *start ;
        *start = * end;
        *end = temp ;

        start++;
        end--;
    }

}

int main()
{
    char Arr[30] = {'\0'} ;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    StrRevX(Arr);

    printf("Modified string is : %s",Arr);

    return 0;
}