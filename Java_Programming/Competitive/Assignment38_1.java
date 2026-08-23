
import java.util.Scanner;

class Assignment38_1
{
//--------------------------------------------------------------------//
// Function Name : CountOne
// Description   : Counts the number of ON bits in the given number.
// Input         : Long integer number
// Output        : Number of ON bits
// Author        : Pranav Avinash Narkhede
// Date          : 17-07-2026
//--------------------------------------------------------------------//
    static int CountOne(long iNo )
    {
        long iMask = 0x1 ;
        int iCount = 0 ;

        while(iMask != 0x0)
        {
            if((iMask & iNo) == iMask)
            {
                iCount++;
            }
            iMask = iMask<<1 ;
        }

        return iCount;
    }
//--------------------------------------------------------------------//
// Application to count the number of ON bits in a given number.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iValue = 0 ; 
        int iRet = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextLong();

        iRet = CountOne(iValue );

        System.out.println("Total ON bits are : "+iRet);
        
    }
}
