
import java.util.Scanner;

class Assignment35_3
{
//--------------------------------------------------------------------//
// Function Name : ChkBit
// Description   : Checks whether the 7th, 15th, 21st and 28th bits are ON or OFF.
// Input         : Long integer number
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static boolean ChkBit(long iNo)
    {
        long iMask = 0x0 ;

        iMask = 0x08104040L;

        if((iMask & iNo ) == iMask)
        {
            return true;
        }
        else
        {
            return false;s
        }
    }

//--------------------------------------------------------------------//
// Application to check whether the 7th, 15th, 21st and 28th bits are ON or OFF.
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
            System.out.println("7th, 15th , 21th and 28th bits of number is ON");
        }
        else
        {
            System.out.println("7th or 15th or 21th or 28th bit of number is OFF");
        }
    }
}
