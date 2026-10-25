/*
   Write a program which accept string from user and accept one
    character. Check whether that character is present in string or not.

    Input : “Marvellous Multi OS”

    e

    Output : TRUE

    Input : “Marvellous Multi OS”

    W

    Output : FALSE

*/

import java.util.Scanner;

class Assignment33_1
{
    static boolean CountWhite(String str , char key)
    {
        char cArr[] = str.toCharArray();    

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] == key)
            {
                return true;
                
            }
        }
        return false;

        
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        char cValue = '\0';

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        System.out.println(CountWhite(str , cValue));

    }
}