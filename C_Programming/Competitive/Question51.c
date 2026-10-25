// write a program which accept range from user and display all numbers in between that range .

// input : 23   35
// output : 23      24      25      26      27      28      29      30     31       32      33      34      35

// input : 90   18
// output : Invalid range.

#include<stdio.h>

void RangeDisplay(int iStart , int iEnd)
{
    int iCnt = 0;

    if(iStart > iEnd)
    {
        printf("Invalid range");
    }

    for(iCnt = iStart ; iCnt <= iEnd ; iCnt++)
    {
        printf("%d\t",iCnt);
    }

}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter starting point : ");
    scanf("%d",&iValue1);

    printf("Enter ending point : ");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1 , iValue2);

    return 0;
    
}

// Time Complexity : O(N)
// where N = iEnd - iStart + 1