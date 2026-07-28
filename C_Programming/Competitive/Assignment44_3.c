/*
    Write application which accept file name from user and read all data from that file
    and display contents on screen.

    Input : Demo.txt
    Output : Display all data of file..
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

# define BUFFER_SIZE 1024
# define FILE_ERROR -1

int DisplayContent(char fName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0 ;
    int iRet = 0 ;
    
    fd = open(fName , O_RDONLY);

    if(fd == -1)
    {
        return FILE_ERROR;
    }

    while((iRet = read(fd , Buffer , sizeof(Buffer))) != 0)
    {
        write(1 , Buffer , iRet);

        memset(Buffer , '\0',sizeof(Buffer));
    }

    close(fd);

}

int main()
{
    char FileName[30] = {'\0'} ;
    int iRet = 0 ;

    printf("Enter file name : ");
    scanf("%[^'\n']s",FileName);

    iRet = DisplayContent(FileName);

    if(iRet == FILE_ERROR)
    {
        printf("File is not opened");
    }
    
    return 0 ;
}