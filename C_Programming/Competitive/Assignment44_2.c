/*
    Write application which accept file name from user and create that file.
    
    Input : Demo.txt
    Output : File created successfully.
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int CreateFile(char fName[])
{
    int fd = 0 ;

    fd = creat(fName , 0777);

    return fd ;

}

int main()
{
    char FileName[30] = {'\0'} ;
    int iRet = 0 ;

    printf("Enter file name : ");
    scanf("%[^'\n']s",FileName);

    iRet = CreateFile(FileName);

    if(iRet == -1)
    {
        printf("File is not created");
    }
    else
    {
        printf("File gets create sucessfully");
    }

    return 0 ;
}