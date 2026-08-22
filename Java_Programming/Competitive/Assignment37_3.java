
import java.util.Scanner;

class Assignment37_3
{
//--------------------------------------------------------------------//
// Function Name : OnBit
// Description   : Turns ON the bit at the given position.
// Input         : Long integer number and bit position
// Output        : Modified number
// Author        : Pranav Avinash Narkhede
// Date          : 14-07-2026
//--------------------------------------------------------------------//
    static long OnBit(long iNo , int iPos)
    {
        long iMask = 0x1 ;

        iMask = iMask << (iPos - 1) ;

        return (iNo | iMask) ;
        
    }

//--------------------------------------------------------------------//
// Application to turn ON a bit at the given position.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        int iPos = 0 ;
        long lRet = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        lRet = OnBit(iValue , iPos);

        System.out.println("Modified number is : "+lRet);
        
    }
}
