
import java.util.Scanner;

class Assignment41_4
{
    static int iFact = 1 ; 

//--------------------------------------------------------------------//
// Function Name : Fact
// Description   : Calculates the factorial of a number recursively.
// Input         : Integer number
// Output        : Factorial of number
// Author        : Pranav Avinash Narkhede
// Date          : 24-07-2026
//--------------------------------------------------------------------//
    public static int Fact(int iNo)
    {
        if (iNo != 0)
        {
            iFact = iFact * iNo ;
            iNo--;
            Fact(iNo);
        }
        return iFact;
    }

//--------------------------------------------------------------------//
// Application to calculate factorial of a number using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = Fact(iValue);

        System.out.println("Factorial of number is : "+iRet);
    }
}