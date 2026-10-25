
import java.util.Scanner;

class Assignment38_5
{
//--------------------------------------------------------------------//
// Function Name : ToggleBitRange
// Description   : Toggles all bits within the given position range.
// Input         : Number and start and end bit positions
// Output        : Modified number
// Author        : Pranav Avinash Narkhede
// Date          : 17-07-2026
//--------------------------------------------------------------------//
    static long ToggleBitRange(long iNo ,int iPos1 , int iPos2)
    {
        long iMaskFinal = 0x0 ;
        long iMask = 0x1;

        for(int i = iPos1 ; i <= iPos2 ; i++)
        {
            iMask = iMask<<(i-1);

            iMaskFinal = iMaskFinal | iMask ;

            iMask = 0x1;
        }

        return (iNo ^ iMaskFinal);
    }

//--------------------------------------------------------------------//
// Application to toggle all bits within a given position range.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ;
        int iPos1 = 0 ;
        int iPos2 = 0 ; 
        long lRet = 0L ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        System.out.println("Enter start position : ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter end position : ");
        iPos2 = sobj.nextInt();

        lRet = ToggleBitRange(iValue , iPos1 , iPos2);

        System.out.println("Modified number is : "+lRet);
        
    }
}
