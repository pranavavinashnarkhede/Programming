/*
    write a program which accept string from user and return difference between 
    frequency of small characters and frequency of capital characters.

    Input :     "MarvellouS" 
    Output :    6

*/

#include<stdio.h>

int Difference(char *str)
{
    int iCountC = 0 ;
    int iCountS = 0 ;

    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCountS++;
        }
        else if ((*str >= 'A') && (*str <= 'Z'))
        {
            iCountC++;
        }
        str++;
    }
    return (iCountS-iCountC);
}

int main()
{
    char arr[20];
    int iRet = 0 ;

    printf("Enter string : ");
    scanf("%[^'\n]s",arr);

    iRet = Difference(arr);

    printf("%d",iRet);

    return 0;
}