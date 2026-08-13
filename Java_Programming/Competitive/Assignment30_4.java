/*
    Accept character from user. If it is capital then display all the
    characters from the input characters till Z. If input character is small
    then print all the characters in reverse order till a. In other cases
    return directly.

*/

import java.util.Scanner;

class Assignment30_4
{
    static boolean Display(char cValue)
    {
        if(cValue == '!' || cValue == '@' || cValue == '#' || cValue == '$'
           || cValue == '%' || cValue == '^' || cValue == '&' || cValue == '*')
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

        char cValue = '\0';
        
        System.out.println("Enter any character : ");
        cValue = sobj.next().charAt(0);

        System.out.println(Display(cValue));
    }
}