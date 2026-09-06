import java.util.*;

class Assignment54_1
{
//--------------------------------------------------------------------//
// Function Name : CheckStrong
// Description   : Checks whether the given number is a Strong Number.
// Input         : Integer number
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 26/07/2026
//--------------------------------------------------------------------//

    public static boolean CheckStrong(int iNo)
    {
        int iFact = 0 ;
        int iSum = 0 ;
        int iTemp = 0 ;
        int iDigit = 0 ;

        iTemp = iNo ;
        iFact = 1 ;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10 ;

            while(iDigit != 0 )
            {
                iFact = iFact * iDigit;
                iDigit--;
            }

            iTemp = iTemp / 10 ;

            iSum = iSum + iFact;
            iFact = 1 ;

            if(iSum > iNo)
            {
                break;
            }
            
        }

        return iSum == iNo;
    }
//--------------------------------------------------------------------//
// Application to check whether a number is a Strong Number.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0 ;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        bRet = CheckStrong(iNo);
        if(bRet == true)
        {
            System.out.println("It is Strong Number ");
        }
        else
        {
            System.out.println("It is not a Strong Number  ");
        }
        
    }
}