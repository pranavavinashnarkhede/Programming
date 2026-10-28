/*
    Write a program to find even factorial of given number.

    Input : 5
    Output : 8 (4 * 2)
    Input : -5
    Output : 8 (4 * 2)
*/


import java.util.Scanner;

class Assignment7_3
{
    static int EvenFactorial(int iNo)
    {
        int iFact = 1 ;
        int i = 0 ;

        if(iNo < 0 )
        {
            iNo = -iNo ;
        }
        
        for(i = 1 ; i <= iNo ; i++)
        {
            if (i % 2 == 0)
            {
                iFact = iFact * i ;
            }
        }
        return iFact;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = EvenFactorial(iValue);

        System.out.println("Even Factorial of " + iValue + " is : "+iRet);

    }

}