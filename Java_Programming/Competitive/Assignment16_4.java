/*
    Accept N numbers from user and display all such numbers which contains
    3 digits in it.

    Input : N : 6
    Elements :8225 665 3 76 953 858
    Output : 665 953 858

*/


import java.util.Scanner;

class Assignment16_4
{
    public static void Digits(int Arr[])
    {
        int iCnt = 0 ;
        int iTemp = 0 ;
        int iDigit = 0 ;
        int iCount = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            iTemp = Arr[iCnt];

            while(iTemp != 0)
            {
                iDigit = iTemp % 10 ;
                iCount++;
                iTemp = iTemp / 10 ;
            }

            if(iCount == 3)
            {
                System.out.print(Arr[iCnt]+"\t");
            }
            iCount = 0 ; 
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int []p = null;
        int iCnt = 0 ;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();
   
        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" element : ");
            p[iCnt] = sobj.nextInt();
        }

        Digits(p);

    }
}