// write a program which accept number from user and display its table in reverse order .

#include<stdio.h>

void TableRev(int iNo)
{
    int iCnt = 0;

    for(iCnt = 10 ; iCnt >= 1 ; iCnt--)
    {
        printf("%d  ",iNo*iCnt);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    TableRev(iValue);

    return 0;
}

// Time complexity : O(1)
