import java.util.*;

class Assignment55_5
{
    //--------------------------------------------------------------------//
    // Function Name : CheckDisarium
    // Description   : Checks whether the given number is a Disarium Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 29/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckDisarium(int iNo)
    {
        int iSum = 0 ;
        int iCount = 0 ;
        int iDigit = 0 ;
        int iTemp = 0 ;

        iTemp = iNo;

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        while(iCount != 0)
        {
            iDigit = iTemp % 10 ;
            iSum = iSum + (int)Math.pow(iDigit , iCount);
            iCount--;
            iTemp = iTemp / 10 ;
        }

        return iSum == iNo;

    }
    //--------------------------------------------------------------------//
    // Application to check whether a number is a Disarium Number.
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

        bRet = CheckDisarium(iNo);

        if(bRet == true)
        {
            System.out.println("It is Disarium Number ");
        }
        else
        {
            System.out.println("It is not a Disarium Number  ");
        }
        
    }
}