/*
    Write a recursive program which accept string from user and count number
    of characters.
    Input : Hello
    Output : 5
*/

#include<stdio.h>

int StrlenX(char *str)
{
    static int iCount = 0 ;

    if(*str != '\0')
    {
        iCount++;
        str++;

        StrlenX(str);
    }
    return iCount;
}

int main()
{
    char arr[20] = {'\0'};
    int iRet = 0 ;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    iRet = StrlenX(arr);

    printf("Result is : %d\n",iRet);

    return 0 ;
}