
#include<stdio.h>
#include<unistd.h>                  
#include<fcntl.h> 
#include<stdlib.h>  // for malloc                  

void DisplayN(char fName[] , int iValue)
{
    int fd = 0 ;
    int iRet = 0 ;
    int iCnt = 0 ;

    char *Buffer = NULL ;

    Buffer = (char*)malloc(iValue * sizeof(char));

    fd = open(fName ,O_RDONLY);

    if(fd == -1)
    {
        return ;
    }

    iRet = read(fd , Buffer , iValue);

    if(iRet > 0)
    {
        write(1 , Buffer , iRet);
    }

    close(fd);

}

int main()
{
    char FileName[30] = {'\0'};
    int iValue = 0;

    printf("Enter the file name : ");
    scanf("%[^'\n']s",FileName);

    printf("Enter the number of character : ");
    scanf(" %d",&iValue);

    if(iValue < 0)
    {
        printf("Invalid number of characters ");
        return -1;
    }

    DisplayN(FileName , iValue);

    return 0 ;
}