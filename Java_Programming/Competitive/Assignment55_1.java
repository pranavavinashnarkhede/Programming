import java.util.*;

class Assignment55_1
{
    //--------------------------------------------------------------------//
    // Function Name : CheckNeon
    // Description   : Checks whether the given number is a Neon Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 28/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckNeon(int iNo)
    {
        int iSum = 0 ;
        int iSquare = 0 ;

        iSquare = (int)Math.pow(iNo , 2);

        while(iSquare != 0)
        {
            iSum = iSum + (iSquare % 10);

            iSquare = iSquare / 10;
        }

        return iSum == iNo;
        
    }
    //--------------------------------------------------------------------//
    // Application to check whether a number is a Neon Number.
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

        bRet = CheckNeon(iNo);

        if(bRet == true)
        {
            System.out.println("It is Neon Number ");
        }
        else
        {
            System.out.println("It is not a Neon Number  ");
        }
        
    }
}