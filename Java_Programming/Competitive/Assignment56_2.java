import java.util.*;

class Assignment56_2
{
    //--------------------------------------------------------------------//
    // Function Name : CheckAnagrams
    // Description   : Checks whether two strings are anagrams.
    // Input         : Two strings
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 30/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckAnagrams(String str1 , String str2)
    {
        int iValue = 0 ;
        int i = 0 ;

       HashMap<Character , Integer> hobj = new HashMap<Character , Integer>();

        if(str1.length() != str2.length())
        {
            return false;
        }

       for(i = 0 ; i <str1.length() ; i++ )
       {
            if(hobj.containsKey(str2.charAt(i)))
            {
                iValue = hobj.get(str2.charAt(i));
                hobj.put(str2.charAt(i) , iValue+1);
            }
            else
            {
                hobj.put(str1.charAt(i) , 1);
            }
       }

       for(i = 0 ; i <str2.length() ; i++)
       {
            if(hobj.containsKey(str.charAt(i)))
            {
                iValue = hobj.get(str.charAt(i));
                hobj.put(str.charAt(i) , iValue-1);
            }
            else
            {
                return false;
            }
       }

        Set<Character> keys = hobj.keySet();

        for(Character ch : keys)
        {
            if(hobj.get(ch) != 0)
            {
                return false;
            }
        }

        return true;

    }
    
    //--------------------------------------------------------------------//
    // Application to check whether two strings are anagrams.
    //--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;
        String str2 = null;
        boolean bRet = false;

        System.out.println("Enter first string : ");
        str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        str2 = sobj.nextLine();

        bRet = CheckAnagrams(str1 , str2);

        if(bRet == true)
        {
            System.out.println("Strings are Anagrams");
        }
        else
        {
            System.out.println("Strings are not Anagrams");
        }

    }
}