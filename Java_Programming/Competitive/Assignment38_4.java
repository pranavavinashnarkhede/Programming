
import java.util.Scanner;

class Assignment38_4
{
//--------------------------------------------------------------------//
// Function Name : ChkBit
// Description   : Checks whether the bit at either position is ON.
// Input         : Number and two bit positions
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 17-07-2026
//--------------------------------------------------------------------//
    static boolean ChkBit(long iNo ,int iPos1 , int iPos2)
    {
        long iMask1 = 0x1 ;
        long iMask2 = 0x1 ;

        iMask1 = iMask1<<iPos1-1;
        iMask2 = iMask2<<iPos2-1;

        iMask1 = iMask1 | iMask2 ;

        if((iNo & iMask1 )  != 1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

//--------------------------------------------------------------------//
// Application to check whether either of two given bits is ON.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ;
        int iPos1 = 0 ;
        int iPos2 = 0 ; 

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        System.out.println("Enter first position : ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second position : ");
        iPos2 = sobj.nextInt();

        if(ChkBit(iValue , iPos1 , iPos2))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
        
    }
}
