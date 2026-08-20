
import java.util.Scanner;

class Assignment35_5
{
//--------------------------------------------------------------------//
// Function Name : ChkBit
// Description   : Checks whether the first and last bits are ON or OFF.
// Input         : Long integer number
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//
    static boolean ChkBit(long iNo)
    {
        long iMask = 0x0 ;

        iMask = 0x80000001L;                // for long add L at last

        if((iMask & iNo ) == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

//--------------------------------------------------------------------//
// Application to check whether the first and last bits are ON or OFF.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        boolean bRet = false ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        bRet = ChkBit(iValue);

        if(bRet == true)
        {
            System.out.println("First and last bits of number is ON");
        }
        else
        {
            System.out.println("First or last bits of number is OFF");
        }
    }
}
