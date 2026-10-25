/*
    Accept character from user. If it is capital then display all the
    characters from the input characters till Z. If input character is small
    then print all the characters in reverse order till a. In other cases
    return directly.

*/

import java.util.Scanner;

class Assignment30_3
{
    static void Display(char cValue)
    {
        if(cValue >= 'A' && cValue <= 'Z')
        {
            for(int i = cValue ; i <= 'Z' ; i++ )
            {
                System.out.print((char)i+"\t");
            }
        }
        else if (cValue >= 'a' && cValue <= 'z')
        {
            for(int i = cValue ; i >= 'a' ; i--)
            {
                System.out.print((char)i+"\t");
            }
        }
        else
        {
            System.out.println();
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter any character : ");
        cValue = sobj.next().charAt(0);

        Display(cValue);
    }
}