/*
    Write a program which accept string from user and count number of
    capital characters.

    Input : “Marvellous Multi OS”

    Output : 4

*/

import java.util.Scanner;

class Assignment31_1
{
    static int CountCapital(String str)
    {
        char cArr[] = str.toCharArray();                // converting string into charactr array
        int iCount = 0 ;

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'A' && cArr[i] <= 'Z')
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

        iRet = CountCapital(str);

        System.out.println("Total Capital letters in string are : "+iRet);
    }
}