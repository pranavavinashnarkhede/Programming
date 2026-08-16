/*
   Write a program which accept string from user and convert it into
    lower case.

    Input : “Marvellous Multi OS”

    Output : marvellous multi os

*/

import java.util.Scanner;

class Assignment32_1
{
    static void Strlwrx(String str)
    {
        char cArr[] = str.toCharArray();              

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'A' && cArr[i] <= 'Z')
            {
                cArr[i] = (char)(cArr[i] + 32) ;
            }
        }

        str = new String(cArr);
        System.out.println(str);

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        Strlwrx(str);

    }
}