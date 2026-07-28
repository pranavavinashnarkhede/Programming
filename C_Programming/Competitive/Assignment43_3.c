/*
    Write a program which accepts file name from user and count number of
    white spaces from that file.

    Input : Demo.txt
    Output : Number of white spaces are 13
*/

#include<stdio.h>
#include<unistd.h>                  
#include<fcntl.h>                   
#include<string.h>                  

# define BUFFER_SIZE 1024
# define FILE_ERROR -1

int CountWhite(char fName[])
{
    int iCountWhiteSpaces = 0 ;
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0 ;
    int iRet = 0 ;
    int iCnt = 0 ;

    fd = open(fName ,O_RDONLY);

    if(fd == -1)
    {
        return FILE_ERROR;
    }

    while((iRet = read(fd , Buffer , sizeof(Buffer))) != 0)
    {
        for(iCnt = 0 ; iCnt < iRet ; iCnt++)
        {
            if(Buffer[iCnt] == ' ')
            {
                iCountWhiteSpaces++;
            }
        }

        memset(Buffer , '\0',sizeof(Buffer));               
    }

    close(fd);

    return iCountWhiteSpaces;
}

int main()
{
    char FileName[30] = {'\0'};
    int iRet = 0 ;

    printf("Enter the file name : ");
    scanf("%[^'\n']s",FileName);

    iRet = CountWhite(FileName);

    if(iRet == FILE_ERROR)
    {
        printf("File is not opened");
    }
    else
    {
        printf("Number of white spaces are : %d\n",iRet);
    }
    

    return 0 ;
}