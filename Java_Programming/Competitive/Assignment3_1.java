/*
 Write a program which accept one number from user and print that number of
even numbers on screen.
Input : 7
Output: 2 4 6 8 10 12 14

*/

import java.util.Scanner;

class Assignment3_1
{
    static void PrintEven(int iNo)
    {
        if (iNo < 0)
        {
            return;
        }

        for(int i = 2 ; i <= iNo ; i = i+2)
        {
            System.out.print(i + "\t");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        Display(PrintEven);
    }

    
}