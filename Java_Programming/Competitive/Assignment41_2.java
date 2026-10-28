
import java.util.Scanner;

class Assignment41_2
{
    static int iSum = 0 ;

//--------------------------------------------------------------------//
// Function Name : Sum
// Description   : Calculates the sum of digits recursively.
// Input         : Integer value
// Output        : Sum of digits
// Author        : Pranav Avinash Narkhede
// Date          : 23-07-2026
//--------------------------------------------------------------------//
    static int Sum(int iValue )
    {
        if(iValue != 0)
        {   
            iSum = iSum + (iValue % 10) ;
            Sum(iValue/10);
        }

        return iSum;
    }

//--------------------------------------------------------------------//
// Application to calculate the sum of digits using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = Sum(iValue );

        System.out.println("Summation of digits is : "+iRet);
    }
}