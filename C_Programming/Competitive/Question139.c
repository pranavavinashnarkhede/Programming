/*
    write a program which accept string from user and accept one character . 
    return index of last occurrence of that character.

    Input :     Marvellous Multi OS
                M
    Output :    11

    Input :     Marvellous Multi OS
                W
    Output :    -1


*/

#include<stdio.h>

int FirstChar(char *str , char ch) 
{
    int index = 0 ;
    char *start = NULL;

    start = str;

    while(*str != 0)
    {
        str++;
        index++;
    }
    str--;
    index--;
   
    while(str != start)
    {
        if(*str == ch)
        {
            return index;
        }
        str--;
        index--;
    }

    return -1;

}

int main()
{
    char Arr[30];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    printf("Enter the character : ");
    scanf(" %c",&cValue);

    iRet = FirstChar(Arr,cValue);

    printf("Character location is : %d",iRet);

    return 0;

}