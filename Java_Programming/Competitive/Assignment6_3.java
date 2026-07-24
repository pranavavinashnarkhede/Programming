/*
    Write a program to find factorial of given number.
    Input : 5
    Output : 120 (5 * 4 * 3 * 2 * 1)

*/


import java.util.Scanner;

class Assignment6_3
{
    static int Factorial(int iNo)
    {
        int iFact = 1;
        int i = 0 ;

        for (i = 1 ; i <= iNo ; i++)
        {
            iFact = iFact * i ;
        }

        return iFact;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;
        
        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        iRet = Factorial(iValue);

        System.out.println("Factorial of "+iValue+" is : "+iRet);
    }

}