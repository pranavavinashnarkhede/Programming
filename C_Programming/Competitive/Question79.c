// accept N numbers from user and display all such numbers which contains 3 digits in it.


#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[],int iLength)
{
    int iCnt = 0 ;
    int iTemp = 0 ;
    int iCounter = 0 ;

    for(iCnt = 0 ;iCnt < iLength ; iCnt++)
    {
        iTemp = Arr[iCnt];

        while (iTemp != 0)
        {
            iCounter++;
            iTemp = iTemp / 10 ;
        }

        if(iCounter == 3)
        {
            printf("%d\t",Arr[iCnt]);
        }

        iCounter = 0;               // each time the counter resets to 0.

    }
    
}

int main()
{
    int iSize = 0 , iCnt = 0 ;
    int *p = NULL;
    
    printf("Enter number of elements : ");
    scanf("%d",&iSize);


    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1 ;
    }

    printf("Enter %d elements \n",iSize);

    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        printf("Enter element : %d\t",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    Digits(p , iSize);

    free(p);

    return 0 ;
}
