/*
    Write a program which accept string from user and accept one
    character. Return frequency of that character.

    Input : “Marvellous Multi OS”

    M

    Output : 2

    Input : “Marvellous Multi OS”

    W

    Output : 0

*/

import java.util.Scanner;

class Assignment33_2
{
    static int CountChar(String str , char key)
    {
        char cArr[] = str.toCharArray(); 
        int iCount = 0 ;   

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] == key)
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
        char cValue = '\0';

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        System.out.println("Frequency is : "+CountChar(str , cValue));

    }
}