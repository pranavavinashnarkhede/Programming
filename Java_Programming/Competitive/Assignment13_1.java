/*
    Accept N numbers from user and return difference between summation
    of even elements and summation of odd elements.
    Input : N : 6

    Elements :85 66 3 80 93 88

    Output : 53 (234 - 181)
*/


import java.util.Scanner;

class Assignment13_1
{

    public static int Difference(int Arr[])
    {
        int iSumEven = 0 ;
        int iSumOdd = 0 ;
        int iCnt = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSumEven = iSumEven + Arr[iCnt];
            }
            else
            {
                iSumOdd = iSumOdd + Arr[iCnt];
            }
        }

        return iSumEven - iSumOdd;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int iRet = 0 ;
        int iCnt = 0 ;
        int []p = null;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" Element : ");
            p[iCnt] = sobj.nextInt();
        }

        iRet = Difference(p);

        System.out.println("Result is : "+iRet);

        System.gc();

    }

}