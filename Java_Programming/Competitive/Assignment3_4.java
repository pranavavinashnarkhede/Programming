/*
    Accept one character from user and convert case of that character.
    Input : a Output : A
    Input : D Output : d

*/

import java.util.Scanner;

class Assignment3_4
{
    static void ConvertCharacter(char cValue)
    {
        if(cValue >= 'A' && cValue <= 'Z')
        {
            System.out.println((char)(cValue+32));
        }
        else if(cValue >= 'a' && cValue <= 'z')
        {
            System.out.println((char)(cValue-32));
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = 0 ;

        System.out.println("Enter any character : ");
        cValue = sobj.next().charAt(0);                           // it will take only first character

        ConvertCharacter(cValue);
    }

   
}