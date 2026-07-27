/*
    Write a recursive program which accept string from user and count white
    spaces.
    Input : HE llo WOr lD
    Output : 3
*/

#include<stdio.h>

int WhiteSpace(char *str)
{
    static int iCount = 0 ;

    if(*str != '\0')
    {
        if(*str == ' ')
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

    printf("WhiteSpace are : %d\n",iRet);

    return 0 ;
}