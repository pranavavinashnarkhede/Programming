/*
    Accept N numbers from user and return the largest number.
    
    Input : N : 6
    Elements :85 66 3 66 93 88
    Output : 93

*/


import java.util.Scanner;

class Assignment16_1
{
    public static int Maximum(int Arr[])
    {
        int iCnt = 0 ;
        int iMax = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iMax )
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax ;
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

        iRet = Maximum(p);

        System.out.println("Maximum number is : "+iRet);
    }
}