
import java.util.Scanner;

class Assignment38_3
{
//--------------------------------------------------------------------//
// Function Name : ChkBit
// Description   : Checks whether the 9th or 12th bit is ON or OFF.
// Input         : Long integer number
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 17-07-2026
//--------------------------------------------------------------------//
    static boolean ChkBit(long iNo )
    {
        long iMask = 0x1 ;

        iMask = 0x00000900L;

        if((iNo & iMask ) != 1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

//--------------------------------------------------------------------//
// Application to check whether the 9th or 12th bit is ON or OFF.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        if(ChkBit(iValue))
        {
            System.out.println("9th or 12th bit is ON");
        }
        else
        {
            System.out.println("9th or 12th bit is OFF");
        }
        
    }
}
