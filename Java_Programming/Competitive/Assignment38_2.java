
import java.util.Scanner;

class Assignment38_2
{
//--------------------------------------------------------------------//
// Function Name : CommonBits
// Description   : Displays common ON bit positions of two numbers.
// Input         : Two long integer numbers
// Output        : Common ON bit positions
// Author        : Pranav Avinash Narkhede
// Date          : 17-07-2026
//--------------------------------------------------------------------//
    static void CommonBits(long iNo1 , long iNo2 )
    {
        long iMask = 0x1 ;
        int iCount = 1 ;

        while(iMask != 0x0)
        {
            if((iMask & iNo1) == iMask && (iMask &iNo2) == iMask)
            {
                System.out.print(iCount+"\t");
            }
            iCount++;
            iMask = iMask<<1 ;
        }

    }

//--------------------------------------------------------------------//
// Application to find common ON bit positions of two numbers.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue1 = 0 ; 
        long iValue2 = 0 ; 

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextLong();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextLong();

        CommonBits(iValue1 , iValue2 );
        
    }
}
