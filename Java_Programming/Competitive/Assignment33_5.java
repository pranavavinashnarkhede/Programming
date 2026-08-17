/*
    Write a program which accept string from user reverse that string
    in place.

    Input : “abcd”

    Output : “dcba”

*/

import java.util.Scanner;

class Assignment33_5
{
    static void StrRevX(String str )
    {
        char cArr[] = str.toCharArray(); 
    
        for(int i = cArr.length-1 ; i >= 0 ; i--)
        {
            System.out.print(cArr[i]);
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        StrRevX(str);

    }
}