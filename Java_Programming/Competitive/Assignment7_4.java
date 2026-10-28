/*
    Write a program to find odd factorial of given number.
    Input : 5
    Output : 15 (5 * 3 * 1)
    Input : -5
    Output : 15 (5 * 3 * 1)
*/


import java.util.Scanner;

class Assignment7_4
{
    static int OddFactorial(int iNo)
    {
        int iFact = 1 ;
        int i = 0 ;

        if(iNo < 0 )
        {
            iNo = -iNo ;
        }
        
        for(i = 1 ; i <= iNo ; i++)
        {
            if (i % 2 != 0)
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

        iRet = OddFactorial(iValue);

        System.out.println("Odd Factorial of " + iValue + " is : "+iRet);

    }

}