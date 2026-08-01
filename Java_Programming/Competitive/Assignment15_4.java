/*
    Accept N numbers from user and accept Range, Display all elements from
    that range

    Input : N : 6
    Start: 60
    End : 90
    Elements :85 66 3 76 93 88
    Output : 66 76 88

*/


import java.util.Scanner;

class Assignment15_4
{
    public static void Range(int Arr[] , int iStart , int iEnd)
    {
        int iCnt = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] > iStart) && (Arr[iCnt] < iEnd))
            {
                System.out.print(Arr[iCnt]+"\t");
            }
            
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int iValue1 = 0 ;
        int iValue2 = 0 ;
        int []p = null;
        int iCnt = 0 ;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = sobj.nextInt();

        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" element : ");
            p[iCnt] = sobj.nextInt();
        }

        Range(p , iValue1 , iValue2);

    }
}