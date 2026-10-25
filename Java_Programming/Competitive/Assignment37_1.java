
import java.util.Scanner;

class Assignment37_1
{
//--------------------------------------------------------------------//
// Function Name : OnBit
// Description   : Checks whether the bit at the given position is ON or OFF.
// Input         : Long integer number and bit position
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 14-07-2026
//--------------------------------------------------------------------//
    static boolean OnBit(long iNo , int iPos)
    {
        long iMask = 0x1 ;
        long iResult = 0x0;

        iMask = iMask<<(iPos-1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

//--------------------------------------------------------------------//
// Application to check whether a bit at the given position is ON or OFF.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        int iPos = 0 ;
        boolean bRet = false ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        bRet = OnBit(iValue , iPos);

        if(bRet)
        {
            System.out.println("Bit is ON of the "+iPos+ " position");
        }
        else
        {
            System.out.println("Bit is Off of the "+iPos+ " position");
        }
        
    }
}
