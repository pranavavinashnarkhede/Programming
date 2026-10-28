/*
    Accept N numbers from user and accept one another number as NO ,
    return frequency of NO form it.

    Input : N : 6
    NO: 66
    Elements :85 66 3 66 93 88
    Output : 2

    Input : N : 6
    NO: 12
    Elements :85 11 3 15 11 111
    Output : 0

*/

import java.util.Scanner;

class Assignment14_4
{
    public static int Frequency(int Arr[] , int iNo)
    {
        int iCnt = 0 ;
        int  iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
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
        int iValue = 0 ;
        int []p = null;
        int iCnt = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" element : ");
            p[iCnt] = sobj.nextInt();
        }

        iRet = Frequency(p , iValue);
        
        System.out.println("Frequency of "+iValue + " is : "+iRet);
        
    }
}