/*
    Write application which accept file name from user and one string from user. Write
    that string at the end of file.

    Input : Demo.txt
    Hello World

    Output : Write Hello World at the end of Demo.txt file
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<stdbool.h>


bool WriteContentAtEnd(char fName[] , char Content[])
{
    int fd = 0 ;
    int iRet = 0 ;
    int ilength = 0 ;

    fd = open(fName , O_WRONLY | O_APPEND );

    if(fd == -1)
    {
        return false ;
    }

    ilength = strlen(Content);

    iRet = write(fd ,Content , ilength);
    
    close(fd);

    if(iRet == ilength)
    {
        return true;
    }
    else
    {
        return false;
    }

}

int main()
{
    char FileName[30] = {'\0'} ;
    char Content[50] = {'\0'} ;

    bool bRet = 0 ;

    printf("Enter file name : ");
    scanf("%[^'\n']s",FileName);

    printf("Enter string : ");
    scanf(" %[^'\n']s",Content);

    bRet = WriteContentAtEnd(FileName , Content);

    if(bRet)
    {
        printf("Content gets added in file successfully");
    }
    else
    {
        printf("There is error in writing content in file");
    }

    return 0 ;
}