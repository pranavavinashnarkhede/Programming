/*
    Accept N numbers from user check whether that numbers contains 11 in
    it or not.

    Input : N : 6
    Elements :85 66 11 80 93 88
    Output : 11 is present

    Input : N : 6
    Elements :85 66 3 80 93 88
    Output : 11 is absent

*/

import java.util.Scanner;

class Assignment14_3
{
    public static boolean Frequency(int Arr[])
    {
        int iCnt = 0 ;
        boolean bFlag = false;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == 11)
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
        int []p = null;
        int iCnt = 0 ;
        boolean bRet = false ;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" element : ");
            p[iCnt] = sobj.nextInt();
        }

        if(Frequency(p))
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is absent");
        }

        
    }
}