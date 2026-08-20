
import java.util.Scanner;

class Assignment35_4
{
//--------------------------------------------------------------------//
// Function Name : ChkBit
// Description   : Checks whether the 7th, 8th and 9th bits are ON or OFF.
// Input         : Long integer number
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//
    static boolean ChkBit(long iNo)
    {
        long iMask = 0x0 ;

        iMask = 0x000001c0L;

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
// Application to check whether the 7th, 8th and 9th bits are ON or OFF.
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
            System.out.println("7th & 8th & 9th bits of number is ON");
        }
        else
        {
            System.out.println("7th or 8th or 9th bit of number is OFF");
        }
    }
}
