/*
    Accept character from user. If character is small display its
    corresponding capital character, and if it small then display its
    corresponding capital. In other cases display as it is.

*/

import java.util.Scanner;

class Assignment30_2
{
    static void Display(char cValue)
    {
        if(cValue >= 'a' && cValue <= 'z')
        {
            System.out.println((char)(cValue-32));
        }
        else if(cValue >= 'A' && cValue <= 'Z')
        {
            System.out.println((char)(cValue+32));
        }
        else
        {
            System.out.println(cValue);
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