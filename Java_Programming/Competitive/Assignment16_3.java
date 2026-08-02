/*
    Accept N numbers from user and return the difference between largest
    and smallest number.

    Input : N : 6
    Elements :85 66 3 66 93 88
    Output : 90 (93 -3)

*/


import java.util.Scanner;

class Assignment16_3
{
    public static int Difference(int Arr[])
    {
        int iCnt = 0 ;
        int iMin = 0 ;
        int iMax = 0 ;

        iMin = Arr[0];

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] < iMin )
            {
                iMin = Arr[iCnt];
            }
            else if (Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
            
        }
        return iMax - iMin ;
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

        iRet = Difference(p);

        System.out.println("Difference between minimum and maximum number is : "+iRet);
    }
}