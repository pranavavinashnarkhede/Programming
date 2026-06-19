/* 
    Write a program which display ASCII table . table contains symbol , Decimal , 
    Hexadecimal and Octal representation of every member from 0 to 255.

*/

#include<stdio.h>

void DisplayASCII()
{
    int iCnt = 0 ;

    printf("Dec  Hexa  Char");
    for(iCnt = 0 ; iCnt <= 255 ; iCnt++)
    {
        printf("%d\t%X\t%c\n",iCnt , iCnt , iCnt);
    }

}

int main()
{
 
    DisplayASCII();

    return 0 ;
}
