/*
    Accept Character from user and check whether it is alphabet or not
    
    Input : F
    Output : TRUE
    Input : &
    Output : FALSE

*/

import java.util.Scanner;

class Assignment29_1
{
    static boolean ChkAlpha(char cValue)
    {
        if((cValue >= 'a' && cValue <= 'z') || (cValue >= 'A' && cValue <= 'Z'))
        {
            return true;
        }
        return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter any character : ");
        cValue = sobj.next().charAt(0);

        if(ChkAlpha(cValue))
        {
            System.out.println("It is Character");
        }
        else
        {
            System.out.println("It is not a Character");
        }

        
    }
}