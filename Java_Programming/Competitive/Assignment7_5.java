/*
    Write a program which returns difference between Even factorial and odd factorial
    of given number.
    Input : 5
    Output : -7 (8 - 15)
    Input : -5
    Output : -7 (8 - 15)
*/


import java.util.Scanner;

class Assignment7_5
{
    static int FactorialDiff(int iNo)
    {
        int iFactEven = 1 ;
        int iFactOdd = 1 ;
        int i = 0 ;

        if(iNo < 0 )
        {
            iNo = -iNo ;
        }
        
        for(i = 1 ; i <= iNo ; i++)
        {
            if (i % 2 != 0)
            {
                iFactOdd = iFactOdd * i ;
            }
            else
            {
                iFactEven = iFactEven * i ;
            }
        }

        return iFactEven - iFactOdd ;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = FactorialDiff(iValue);

        System.out.println("Factorial difference is : "+iRet);

    }

}