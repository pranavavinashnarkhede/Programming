
import java.util.Scanner;

class Assignment41_5
{
    static int iProduct = 1 ; 

//--------------------------------------------------------------------//
// Function Name : Mult
// Description   : Calculates the product of digits recursively.
// Input         : Integer number
// Output        : Product of digits
// Author        : Pranav Avinash Narkhede
// Date          : 24-07-2026
//--------------------------------------------------------------------//
    public static int Mult(int iNo)
    {
        int iDigit = 0 ;

        if(iNo != 0)
        {
            iDigit = iNo % 10 ;

            iProduct = iDigit * iProduct;

            iNo = iNo / 10 ;

            Mult(iNo);
        }

        return iProduct;
        
    }

//--------------------------------------------------------------------//
// Application to calculate the product of digits using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = Mult(iValue);

        System.out.println("Product of digits : "+iRet);
    }
}