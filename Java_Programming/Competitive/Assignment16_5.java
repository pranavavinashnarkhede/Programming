/*
    Accept N numbers from user and display summation of digits of each
    number.

    Input : N : 6
    Elements :8225 665 3 76 953 858
    Output : 17 17 3 13 17 21

*/


import java.util.Scanner;

class Assignment16_5
{
    public static void DigitsSum(int Arr[])
    {
        int iCnt = 0 ;
        int iTemp = 0 ;
        int iDigit = 0 ;
        int iSum = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            iTemp = Arr[iCnt];

            while(iTemp != 0)
            {
                iDigit = iTemp % 10 ;
                iSum = iSum + iDigit ;
                iTemp = iTemp / 10 ;
            }
   
            System.out.print(iSum+"\t");
            iSum = 0 ;
            
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

        DigitsSum(p);

    }
}