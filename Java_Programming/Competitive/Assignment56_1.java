import java.util.*;

class Assignment56_1
{   
    //--------------------------------------------------------------------//
    // Function Name : CheckPalindrome
    // Description   : Checks whether the given string is a palindrome.
    // Input         : String
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 30/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckPalindrome(String str)
    {
        char Arr[] = str.toCharArray();
        String rev = "";

        for(int i = Arr.length-1 ; i >= 0 ; i--)
        {
            rev = rev + Arr[i];
        }

        return str.equals(rev);
    

    }
    //--------------------------------------------------------------------//
    // Application to check whether a string is a palindrome.
    //--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        boolean bRet = false;

        System.out.println("Enter  string : ");
        str = sobj.nextLine();

        bRet = CheckPalindrome(str);

        if(bRet == true)
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }

    }
}