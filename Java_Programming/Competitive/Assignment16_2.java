/*
    Accept N numbers from user and return the smallest number.
    
    Input : N : 6
    Elements :85 66 3 66 93 88
    Output : 3

*/


import java.util.Scanner;

class Assignment16_2
{
    public static int Minimum(int Arr[])
    {
        int iCnt = 0 ;
        int iMin = 0 ;

        iMin = Arr[0];

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] < iMin )
            {
                iMin = Arr[iCnt];
            }
            
        }
        return iMin ;
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

        iRet = Minimum(p);

        System.out.println("Minimum number is : "+iRet);
    }
}