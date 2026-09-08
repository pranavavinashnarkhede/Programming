import java.util.*;

class Assignment54_5
{
    //--------------------------------------------------------------------//
    // Function Name : CheckPalindrome
    // Description   : Checks whether the given number is a Palindrome Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 27/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckPalindrome(int iNo)
    {
       int iTemp = 0 ;
       int iDigit = 0 ;
       int iRev = 0 ;

        iTemp = iNo;

       while(iTemp != 0)
       {
            iDigit = iTemp % 10 ;
            iRev = iRev * 10 + iDigit;
            iTemp = iTemp / 10 ;
       }

       return iRev == iNo;
    }

    //--------------------------------------------------------------------//
    // Application to check whether a number is a Palindrome Number.
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

        bRet = CheckPalindrome(iNo);

        if(bRet == true)
        {
            System.out.println("It is Palindrome Number ");
        }
        else
        {
            System.out.println("It is not a Palindrome Number  ");
        }
        
    }
}