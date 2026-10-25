/*
   Write a program which accept string from user and display it inn
    reverse order.

    Input : “MarvellouS”

    Output : “SuollevraM”

*/

import java.util.Scanner;

class Assignment31_5
{
    static void Reverse(String str)
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

        Reverse(str);

    }
}