import java.util.*;

class Assignment57_2
{
//--------------------------------------------------------------------//
// Function Name : LargestWord
// Description   : Finds the largest word from a given string.
// Input         : String
// Output        : Largest word
// Author        : Pranav Avinash Narkhede
// Date          : 03/08/2026
//--------------------------------------------------------------------//
    public static String LargestWord(String str)
    {
        int i = 0 ;
        String Largest = "";

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        for(i = 0 ; i < Tokens.length ; i++)
        {
            if(Largest.length() < Tokens[i].length())
            {
                Largest = Tokens[i];
            }
        }

        return Largest;
    }
    
//--------------------------------------------------------------------//
// Application to find the largest word from a given string.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter  string : ");
        str = sobj.nextLine();

        if(str.length <= 0)
        {
            System.out.println("Invalid Input ");
            return ;
        }

        str = LargestWord(str);

        System.out.println(str);
    }
}