/*
    Accept on character from user and check whether that character is vowel
    (a,e,i,o,u) or not.
    Input : E Output : TRUE
    Input : d Output : FALSE

*/


import java.util.Scanner;

class Assignment3_5
{
    static boolean ChkVowel(char cValue)
    {
        if(cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u' || 
        cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' || cValue == 'U'
        )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = 0 ;
        boolean bRet = false;

        System.out.println("Enter any character : ");
        cValue = sobj.next().charAt(0);                           

        bRet = ChkVowel(cValue);

        if(bRet == true)
        {
            System.out.println("It is vowel");
        }
        else
        {
            System.out.println("It is not vowel");

        }
    }

   
}