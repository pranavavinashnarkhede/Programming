/*
    Accept N numbers from user and return difference between frequency of
    even number and odd numbers.
    Input : N : 7

    Elements :85 66 3 80 93 88 90

    Output : 1 (4 -3)

*/

import java.util.Scanner;

class Assignment14_2
{
    public static int Frequency(int Arr[])
    {
        int iCnt = 0 ;
        int iEvenCount = 0 ;
        int iOddCount = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }
        return iEvenCount - iOddCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int []p = null;
        int iCnt = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" element : ");
            p[iCnt] = sobj.nextInt();
        }

        iRet = Frequency(p);

        System.out.println("Frequency of even numbers are : "+iRet);
    }
}