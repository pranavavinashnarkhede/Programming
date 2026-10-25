/*
    Accept Character from user and check whether it is small case or not (a-z).
    
    Input : g
    Output : TRUE
    Input : D
    Output : FALSE

*/

import java.util.Scanner;

class Assignment29_4
{
    static boolean ChkSmall(char cValue)
    {
        if((cValue >= 'a' && cValue <= 'z'))
        {
            return true;
        }
        return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter any digit : ");
        cValue = sobj.next().charAt(0);

        if(ChkSmall(cValue))
        {
            System.out.println("It is Small case Character");
        }
        else
        {
            System.out.println("It is not a Small case Character");
        }

    }
}