/*
   Write a program which accept string from user and display only
    digits from that string.

    Input : “marve89llous121”

    Output : 89121

    Input : “Demo”

    Output :

*/

import java.util.Scanner;

class Assignment32_4
{
    static void DisplayDigit(String str)
    {
        char cArr[] = str.toCharArray();              

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= '0' && cArr[i] <= '9')
            {
                System.out.print(cArr[i]);
            }
            
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        DisplayDigit(str);

    }
}