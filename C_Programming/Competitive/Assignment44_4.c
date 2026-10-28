/*
    Write application which accept file name from user and display size of file.
    
    Input : Demo.txt
    Output : File size is 56 bytes
*/

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>

# define FILE_ERROR -1

int GetFileSize(char fName[])
{
    int iRet = 0 ;
    
    struct stat sobj;                   // create object of stat

    if(stat(fName , &sobj) == -1)         // when we call stat method it will write all the essential information about the file into the passed object 
    {
        return -1;
    }
    else
    {
        return sobj.st_size;        // there are different method to get info of each parameter
    }
        

}

int main()
{
    char FileName[30] = {'\0'} ;
    int iRet = 0 ;

    printf("Enter file name : ");
    scanf("%[^'\n']s",FileName);

    iRet = GetFileSize(FileName);

    if(iRet == -1)
    {
        printf("File does not exists");
    }
    else
    {
        printf("Size of file is : %d\n",iRet);
    }
    
    return 0 ;
}