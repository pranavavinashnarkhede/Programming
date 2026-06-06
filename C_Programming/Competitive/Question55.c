// write a program which accept range form user and display all numbers in between that range in reverse order.

#include<stdio.h>

void RangeDispalyRev(int iStart , int iEnd)
{
    int iCnt = 0 ;

    if(iStart > iEnd)
    {
        printf("Invalid range");
    }

    for(int iCnt = iEnd ; iCnt >= iStart ;iCnt--)
    {
        printf("%d\t",iCnt);
       
    }
    
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0 ;

    printf("Enter starting point : ");
    scanf("%d",&iValue1);

    printf("Enter ending point : ");
    scanf("%d",&iValue2);

    RangeDispalyRev(iValue1 , iValue2);

    return 0;
}


// Time Complexity : O(N)
// where N = iEnd - iStart + 1