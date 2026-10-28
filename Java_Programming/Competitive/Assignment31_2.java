/*
    Write a program which accept string from user and count number of
    small characters.

    Input : “Marvellous”

    Output : 9

*/

import java.util.Scanner;

class Assignment31_2
{
    static int CountSmall(String str)
    {
        char cArr[] = str.toCharArray();               
        int iCount = 0 ;

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'a' && cArr[i] <= 'z')
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
        int iRet = 0 ;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        iRet = CountSmall(str);

        System.out.println("Total small letters in string are : "+iRet);
    }
}