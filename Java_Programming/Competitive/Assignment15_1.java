/*
    Accept N numbers from user and accept one another number as NO ,
    check whether NO is present or not.

    Input : N : 6
    NO: 66
    Elements :85 66 3 66 93 88
    Output : TRUE

    Input : N : 6
    NO: 12
    Elements :85 11 3 15 11 111
    Output : FALSE

*/


import java.util.Scanner;

class Assignment15_1
{
    public static boolean Check(int Arr[] , int iNo)
    {
        int iCnt = 0 ;
        boolean bFlag = false;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                bFlag = true;
                break;
            }
            
        }
        return bFlag;
        
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int iValue = 0 ;
        int []p = null;
        int iCnt = 0 ;

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

        if(Check(p , iValue))
        {
            System.out.println("Result is :True");
        }
        else
        {
            System.out.println("Result is : False");
        }
        
        
    }
}