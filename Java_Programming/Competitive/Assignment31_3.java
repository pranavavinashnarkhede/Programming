/*
   Write a program which accept string from user and return difference between frequency of small characters and frequency of
    capital characters.

    Input : “MarvellouS”

    Output : 6 (8-2)

*/

import java.util.Scanner;

class Assignment31_3
{
    static int Difference(String str)
    {
        char cArr[] = str.toCharArray();               
        int iCountCap = 0  , iCountSmall = 0 ;

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'a' && cArr[i] <= 'z')
            {
                iCountSmall++;
            }
            else if(cArr[i] >= 'A' && cArr[i] <= 'Z')
            {
                iCountCap++;
            }
        }

        return iCountSmall - iCountCap ;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iRet = 0 ;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        iRet = Difference(str);

        System.out.println("Difference between capital and small letters are : "+iRet);
    }
}