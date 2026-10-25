/*
Accept N numbers from user and return frequency of even numbers.
Input : N : 6

Elements :85 66 3 80 93 88

Output : 3

*/

import java.util.Scanner;

class Assignment14_1
{
    public static int CountEven(int Arr[])
    {
        int iCnt = 0 ;
        int iCount = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
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

        iRet = CountEven(p);

        System.out.println("Frequency of even numbers are : "+iRet);
    }
}