/*
    Accept Character from user and check whether it is digit or not

    Input : 7
    Output : TRUE
    Input : d
    Output : FALSE

*/

import java.util.Scanner;

class Assignment29_3
{
    static boolean ChkDigit(char cValue)
    {
        if((cValue >= '0' && cValue <= '9'))
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

        if(ChkDigit(cValue))
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }

    }
}