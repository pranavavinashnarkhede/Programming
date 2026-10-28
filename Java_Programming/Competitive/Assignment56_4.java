import java.util.*;

class Assignment56_4
{
    //--------------------------------------------------------------------//
    // Function Name : DisplayDuplicate
    // Description   : Displays all characters that occur more than once.
    // Input         : String
    // Output        : Duplicate characters
    // Author        : Pranav Avinash Narkhede
    // Date          : 1/08/2026
    //--------------------------------------------------------------------//
    public static void DisplayDuplicate(String str)
    {
        int iValue = 0 ;
        int i = 0 ;

       HashMap<Character , Integer> hobj = new HashMap<Character , Integer>();

       for(i = 0 ; i <str.length() ; i++ )
       {
            if(hobj.containsKey(str.charAt(i)))
            {
                iValue = hobj.get(str.charAt(i));
                hobj.put(str.charAt(i) , iValue+1);
            }
            else
            {
                hobj.put(str.charAt(i) , 1);
            }
       }

       Set<Character> allKeys = hobj.keySet();

       for(char ch : allKeys)
       {
            iValue = hobj.get(ch);

            if(iValue > 1)
            {
                System.out.print(ch+"\t");
            }
       }

    }
    
    //--------------------------------------------------------------------//
    // Application to display duplicate characters from a string.
    //--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter  string : ");
        str = sobj.nextLine();

        DisplayDuplicate(str );


    }
}