/*
    Write a recursive program which accept string from user and count number
    of small characters.
    Input : HElloWOrlD
    Output : 5
*/

#include<stdio.h>

int WhiteSpace(char *str)
{
    static int iCount = 0 ;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCount++;
        }
        
        str++;

        WhiteSpace(str);
    }
    return iCount;
}

int main()
{
    char arr[20] = {'\0'};
    int iRet = 0 ;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    iRet = WhiteSpace(arr);

    printf("Frequency of small characters are : %d\n",iRet);

    return 0 ;
}