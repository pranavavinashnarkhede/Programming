import java.util.Scanner;

class Assignment36_1
{
//--------------------------------------------------------------------//
// Function Name : OffBit
// Description   : Turns OFF the 7th bit of the given number.
// Input         : Long integer number
// Output        : Modified number
// Author        : Pranav Avinash Narkhede
// Date          : 11-07-2026
//--------------------------------------------------------------------//
    static long OffBit(long iNo)
    {
        long iMask = 0x0 ;

        iMask = 0x00000040L;

        return (iNo ^ iMask);                

    }

//--------------------------------------------------------------------//
// Application to turn OFF the 7th bit of a given number.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        long lRet = 0;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        lRet = OffBit(iValue);

        System.out.println("Modified number is : "+lRet);
    }
}
