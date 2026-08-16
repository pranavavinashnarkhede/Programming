/*
   Write a program which accept string from user and count number of
    white spaces

    Input : “MarvellouS”

    Output : 0

    Input : “MarvellouS Infosystems”

    Output : 1

*/

import java.util.Scanner;

class Assignment32_5
{
    static int CountWhite(String str)
    {
        char cArr[] = str.toCharArray();    
        int iCount = 0 ;          

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] == ' ')
            {
                iCount++;
            }
            
        }

        return iCount;

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        System.out.println(" Count of whiltespaces are : "+CountWhite(str));

    }
}