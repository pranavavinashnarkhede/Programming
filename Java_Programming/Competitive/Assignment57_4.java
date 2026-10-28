import java.util.*;

class Assignment57_4
{
//--------------------------------------------------------------------//
// Function Name : CountVowelsAndConsonants
// Description   : Counts the number of vowels and consonants in a string.
// Input         : String
// Output        : Number of vowels and consonants
// Author        : Pranav Avinash Narkhede
// Date          : 04/08/2026
//--------------------------------------------------------------------//
    public static void CountVowelsAndConsonants(String str)
    {
        int i = 0 ;
        char ch = '\0';
        int iVowels = 0 ;
        int iConsonants = 0 ;

        for (i = 0 ; i < str.length() ; i++)
        {
            ch = str.charAt(i);
            if(
                ch == 'a' ||
                ch == 'e' || 
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u' ||
                ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U'
            )
            {
                iVowels++;
            }
            else if(
                        (ch >= 'a' && ch <= 'z') ||
                        (ch >= 'A' && ch <= 'Z')
                    )
            {
                iConsonants++;
            }
        }

        System.out.println("Vowels : "+iVowels);
        System.out.println("Consonants : "+iConsonants);
    }
    
//--------------------------------------------------------------------//
// Application to count vowels and consonants in a string.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null ;

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        CountVowelsAndConsonants(str);

    }
}