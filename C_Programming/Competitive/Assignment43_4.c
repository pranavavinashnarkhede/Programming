/*
    Write a program which accepts file name and one character from user and
    count number of occurrences of that characters from that file.

    Input : Demo.txt ‘M’
    Output : Frequency of M is 7
*/

#include<stdio.h>
#include<unistd.h>                  
#include<fcntl.h>                   
#include<string.h>                  

# define BUFFER_SIZE 1024
# define FILE_ERROR -1

int CountChar(char fName[] , char cValue)
{
    int iFrequency = 0 ;
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
            if(Buffer[iCnt] == cValue)
            {
                iFrequency++;
            }
        }

        memset(Buffer , '\0',sizeof(Buffer));               
    }

    close(fd);

    return iFrequency;
}

int main()
{
    char FileName[30] = {'\0'};
    char cValue = '\0';
    int iRet = 0 ;

    printf("Enter the file name : ");
    scanf("%[^'\n']s",FileName);

    printf("Enter the character : ");
    scanf(" %c",&cValue);

    iRet = CountChar(FileName , cValue);

    if(iRet == FILE_ERROR)
    {
        printf("File is not opened");
    }
    else
    {
        printf("Frequency of %c in file is  : %d\n",cValue , iRet);
    }
    

    return 0 ;
}