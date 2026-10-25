
import java.util.Scanner;

class Assignment37_5
{
//--------------------------------------------------------------------//
// Function Name : ToggleBit
// Description   : Toggles the first and last nibbles of the number.
// Input         : Long integer number
// Output        : Modified number
// Author        : Pranav Avinash Narkhede
// Date          : 15-07-2026
//--------------------------------------------------------------------//
    static long ToggleBit(long iNo )
    {
        long iMask = 0x1 ;

        iMask = 0xf000000f ;

        return (iNo ^ iMask) ;
        
    }

//--------------------------------------------------------------------//
// Application to toggle the first and last nibbles of a number.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        long lRet = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        lRet = ToggleBit(iValue );

        System.out.println("Modified number is : "+lRet);
        
    }
}
