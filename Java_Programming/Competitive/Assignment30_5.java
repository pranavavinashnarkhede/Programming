/*
    Accept character from user and display its ASCII value in decimal,
    octal and hexadecimal format.

*/

import java.util.Scanner;

class Assignment30_5
{
    static void Display(char cValue)
    {
        System.out.println("Decimal : "+(int)cValue);
        System.out.println("Octal : "+Integer.toOctalString(cValue));
        System.out.println("Hexadecimal : "+Integer.toHexString(cValue));
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