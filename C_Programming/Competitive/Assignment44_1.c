/*
    Write application which accept file name from user and open that file in read mode.
    
    Input : Demo.txt
    Output : File opened successfully.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int OpenFile(char fName[])
{
    int fd = 0 ;

    fd = open(fName , O_RDONLY);

    return fd ;

    close(fd);

}

int main()
{
    char FileName[30] = {'\0'} ;
    int iRet = 0 ;

    printf("Enter file name : ");
    scanf("%[^'\n']s",FileName);

    iRet = OpenFile(FileName);

    if(iRet == -1)
    {
        printf("File is not opened");
    }
    else
    {
        printf("File gets opened sucessfully");
    }

    return 0 ;
}