// write a program which accept range from user and display all even numbers in between that range.

#include<stdio.h>

void RangeDisplayEven(int iStart , int iEnd)
{
    int iCnt = 0;

    if(iStart > iEnd)
    {
        printf("Invalid range");
    }

    for(iCnt = iStart ; iCnt <= iEnd ; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            printf("%d\t",iCnt);
        }
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

    RangeDisplayEven(iValue1 , iValue2);

    return 0;
}

// Time Complexity : O(N)
// where N = iEnd - iStart + 1