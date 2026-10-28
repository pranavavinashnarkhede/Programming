import java.util.*;

class Assignment56_5
{
     //--------------------------------------------------------------------//
    // Function Name : CountFrequency
    // Description   : Counts the frequency of each character in a string.
    // Input         : String
    // Output        : Frequency of each character
    // Author        : Pranav Avinash Narkhede
    // Date          : 1/08/2026
    //--------------------------------------------------------------------//
    public static void CountFrequency(String str)
    {
        int iValue = 0 ;
        int i = 0 ;

        str = str.replaceAll("\\s+" , "");

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

       System.out.println();

       for(char ch : allKeys)
       {
            iValue = hobj.get(ch);
            System.out.println(ch +" -> "+iValue);
       }

    }

    //--------------------------------------------------------------------//
    // Application to count the frequency of each character in a string.
    //--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter  string : ");
        str = sobj.nextLine();

        CountFrequency(str );


    }
}