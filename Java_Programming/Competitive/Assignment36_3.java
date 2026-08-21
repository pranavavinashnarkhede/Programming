
import java.util.Scanner;

class Assignment36_3
{
//--------------------------------------------------------------------//
// Function Name : ToggleBit
// Description   : Toggles the 7th bit of the given number.
// Input         : Long integer number
// Output        : Modified number
// Author        : Pranav Avinash Narkhede
// Date          : 11-07-2026
//--------------------------------------------------------------------//
    static long ToggleBit(long iNo)
    {
        long iMask = 0x0 ;

        iMask = 0x00000040L;      

        return (iNo ^ iMask);         

    }

//--------------------------------------------------------------------//
// Application to toggle the 7th bit of a given number.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        long lRet = 0;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        lRet = ToggleBit(iValue);

        System.out.println("Modified number is : "+lRet);
    }
}
