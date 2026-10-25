
import java.util.Scanner;

class Assignment35_2
{
//--------------------------------------------------------------------//
// Function Name : ChkBit
// Description   : Checks whether the 5th and 18th bits are ON or OFF.
// Input         : Integer number
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static boolean ChkBit(int iNo)
    {
        int iMask = 0x0 ;

        iMask = 0x00020010;

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
// Application to check whether the 5th and 18th bits are ON or OFF.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ; 
        boolean bRet = false ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        bRet = ChkBit(iValue);

        if(bRet == true)
        {
            System.out.println("5 and 18 bit of number is ON");
        }
        else
        {
            System.out.println("5 or 18 bit of number is OFF");
        }
    }
}
