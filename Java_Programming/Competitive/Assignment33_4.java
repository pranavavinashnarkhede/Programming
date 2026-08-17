/*
    Write a program which accept string from user and accept one
    character. Return index of last occurrence of that character.

    Input : “Marvellous Multi OS”

    M

    Output : 11

    Input : “Marvellous Multi OS”

    W

    Output : -1

    Input : “Marvellous Multi OS”

    e

    Output : 4

*/

import java.util.Scanner;

class Assignment33_4
{
    static int LastChar(String str , char key)
    {
        char cArr[] = str.toCharArray(); 
        int iCount = 0 ;
        int i = 0 ;   

        for(i = cArr.length-1 ; i >= 0 ; i--)
        {
            if(cArr[i] == key)
            {
                break;
            }
        }

        if(i >= 0)
        {
            return i;
        }
        else
        {
            return -1;
        }

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

        System.out.println("Last index of character is : "+LastChar(str , cValue));

    }
}