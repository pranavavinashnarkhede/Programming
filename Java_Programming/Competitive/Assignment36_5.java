
import java.util.Scanner;

class Assignment36_5
{
//--------------------------------------------------------------------//
// Function Name : OnBit
// Description   : Turns ON the first 4 bits of the given number.
// Input         : Long integer number
// Output        : Modified number
// Author        : Pranav Avinash Narkhede
// Date          : 12-07-2026
//--------------------------------------------------------------------//
    static long OnBit(long iNo)
    {
        long iMask = 0x0 ;

        iMask = 0x0000000FL;      

        return (iNo | iMask);         

    }

//--------------------------------------------------------------------//
// Application to turn ON the first 4 bits of a given number.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        long lRet = 0;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        lRet = OnBit(iValue);

        System.out.println("Modified number is : "+lRet);
    }
}
