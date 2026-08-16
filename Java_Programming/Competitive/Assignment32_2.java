/*
   Write a program which accept string from user and convert it into
    upper case.

    Input : “Marvellous Multi OS”

    Output : MARVELLOUS MULTI OS

*/

import java.util.Scanner;

class Assignment32_2
{
    static void Struprx(String str)
    {
        char cArr[] = str.toCharArray();              

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'a' && cArr[i] <= 'z')
            {
                cArr[i] = (char)(cArr[i] - 32) ;
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

        Struprx(str);

    }
}