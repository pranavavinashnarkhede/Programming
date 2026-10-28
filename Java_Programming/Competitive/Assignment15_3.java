/*
    Accept N numbers from user and accept one another number as NO ,
    return index of last occurrence of that NO.

    Input : N : 6
    NO: 66
    Elements :85 66 3 66 93 88
    Output : 3

*/


import java.util.Scanner;

class Assignment15_3
{
    public static int LastOcc(int Arr[] , int iNo)
    {
        int iCnt = 0 ;

        for(iCnt = Arr.length-1 ; iCnt >= 0 ; iCnt--)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
            
        }

        if(iCnt < Arr.length)
        {
            return iCnt;
        }        
        else
        {
            return -1 ;
        }
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

        iRet = LastOcc(p , iValue);

        if(iRet == -1)
        {
            System.out.println(iValue+" is not present");
        }
        else
        {
            System.out.println("First occurence of "+iValue+" is : "+iRet);
        }
    }
}