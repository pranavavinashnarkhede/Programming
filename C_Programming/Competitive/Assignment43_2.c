/*
    Write a program which accepts file name from user and count number of
    small characters from that file.

    Input : Demo.txt
    Output : Number of small characters are 21
*/

#include<stdio.h>
#include<unistd.h>                  // for read()
#include<fcntl.h>                   // for open()
#include<string.h>                  // for memset

# define BUFFER_SIZE 1024
# define FILE_ERROR -1

int CountSmall(char fName[])
{
    int iCountSmall = 0 ;
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
            if(Buffer[iCnt] >= 'a' && Buffer[iCnt] <= 'z')
            {
                iCountSmall++;
            }
        }

        memset(Buffer , '\0',sizeof(Buffer));               // it clean the buffer with its default value
    }

    close(fd);

    return iCountSmall;
}

int main()
{
    char FileName[30] = {'\0'};
    int iRet = 0 ;

    printf("Enter the file name : ");
    scanf("%[^'\n']s",FileName);

    iRet = CountSmall(FileName);

    if(iRet == FILE_ERROR)
    {
        printf("File is not opened");
    }
    else
    {
        printf("Number of small characters are : %d\n",iRet);
    }
    

    return 0 ;
}