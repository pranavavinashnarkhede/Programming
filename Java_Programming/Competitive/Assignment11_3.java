/*
    Write a program which accept range from user and return addition of all numbers
    in between that range. (Range should contains positive numbers only)
    
    Input : 23 30
    Output : 212
*/


import java.util.Scanner;

class Assignment11_3
{
    static int RangeSum(int iStart , int iEnd)
    {
        int i = 0 ;
        int iSum = 0 ;

        if((iStart < 0) || (iEnd < 0))
        {
            return -1 ;
        }

        for(i = iStart ; i <= iEnd ; i++)
        {
            iSum = iSum + i ;
        }

        return iSum;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 ;
        int iValue2 = 0;
        int iRet = 0 ;

        System.out.println("Enter starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = sobj.nextInt();

        iRet = RangeSum(iValue1 ,iValue2);

        if(iRet == -1)
        {
            System.out.println("Invalid Range");
        }
        else
        {
            System.out.println("Summation is : "+iRet);
        }
    }

}