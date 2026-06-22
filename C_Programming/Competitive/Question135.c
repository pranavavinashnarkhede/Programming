/*
    write a program which accept string from user and count number of white spaces.

    Input :     "Marvellous" 
    Output :    0

    Input :     "Marvellous Infosystems" 
    Output :    1

*/

#include<stdio.h>

int CountWhite(char *str)
{
    int iCount = 0 ;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}

int main()
{
    char arr[30];
    int iRet = 0 ;

    printf("Enter string : ");
    scanf("%[^'\n]s",arr);

    iRet = CountWhite(arr);

    printf("%d",iRet);

    return 0;
}