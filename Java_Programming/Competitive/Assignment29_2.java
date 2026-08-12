/*
    Accept Character from user and check whether it is capital or not

    Input : F
    Output : TRUE
    Input : d
    Output : FALSE

*/

import java.util.Scanner;

class Assignment29_2
{
    static boolean ChkCapital(char cValue)
    {
        if((cValue >= 'A' && cValue <= 'Z'))
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

        if(ChkCapital(cValue))
        {
            System.out.println("It is Capital Character");
        }
        else
        {
            System.out.println("It is not a Capital Character");
        }

        
    }
}