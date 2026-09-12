import java.util.*;

class Assignment56_3
{
    //--------------------------------------------------------------------//
    // Function Name : CheckPangram
    // Description   : Checks whether the given string contains all 26 letters.
    // Input         : String
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 1/08/2026
    //--------------------------------------------------------------------//
    public static boolean CheckPangram(String str)
    {
        int i = 0 ;
        int Arr[] = new int[26];

        if(str.length() < 26)
        {
            return false;
        }

        str = str.toLowerCase();

        for(i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                Arr[str.charAt(i) - 'a'] = Arr[(int)str.charAt(i) - 'a'] + 1 ;
            }
            
        }
        
        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == 0)
            {
                break;
            }
        }

        return i == 26;
    }

    //--------------------------------------------------------------------//
    // Application to check whether a string is a Pangram.
    //--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        boolean bRet = false;

        System.out.println("Enter  string : ");
        str = sobj.nextLine();
   
        bRet = CheckPangram(str);

        if(bRet == true)
        {
            System.out.println("String are Pangram");
        }
        else
        {
            System.out.println("String are not Pangram");
        }

    }
}