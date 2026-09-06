import java.util.*;

class Assignment54_2
{
    //--------------------------------------------------------------------//
    // Function Name : CheckArmstrong
    // Description   : Checks whether the given number is an Armstrong Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 26/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckArmstrong(int iNo)
    {
        int iCount = 0 ;
        int iTemp = 0 ;
        int iSum = 0 ;
        int iDigit = 0 ;

        iTemp = iNo ;

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10 ;
        }

        iTemp = iNo ;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10 ;
            iSum = iSum + (int)Math.pow(iDigit , iCount);
            iTemp = iTemp / 10 ;
        }

        return iSum == iNo ;
    }
    //--------------------------------------------------------------------//
    // Application to check whether a number is an Armstrong Number.
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

        bRet = CheckArmstrong(iNo);
        if(bRet == true)
        {
            System.out.println("It is Armstrong Number ");
        }
        else
        {
            System.out.println("It is not a Armstrong Number  ");
        }
        
    }
}