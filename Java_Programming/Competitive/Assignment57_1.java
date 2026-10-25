import java.util.*;

class Assignment57_1
{
//--------------------------------------------------------------------//
// Function Name : ReverseEachWord
// Description   : Reverses each word of a given string individually.
// Input         : String
// Output        : String with each word reversed
// Author        : Pranav Avinash Narkhede
// Date          : 03/08/2026
//--------------------------------------------------------------------//
    public static void ReverseEachWord(String str)
    {
        int i = 0 ;
        StringBuilder sbobj = null ;
        StringBuilder Result = new StringBuilder();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        for(i = 0 ; i < Tokens.length ; i++)
        {
            sbobj = new StringBuilder(Tokens[i]).reverse();

            Result.append(sbobj);

            if(i != Tokens.length()-1)
            {
                Result.append(" ");
            }
        }

        System.out.println(Result);
        
    }
    
//--------------------------------------------------------------------//
// Application to reverse each word of a given string.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter  string : ");
        str = sobj.nextLine();

        ReverseEachWord(str);


    }
}