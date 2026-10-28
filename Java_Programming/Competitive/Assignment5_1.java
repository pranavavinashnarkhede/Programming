/*
    Write a program which accept number from user and print that number of $ & *
    on screen.

    Input : 5
    Output : $ * $ * $ * $ * $ *

*/


import java.util.Scanner;

class Assignment5_1
{
    static void Pattern(int iNo)
    {

        for(int i = 1 ; i <= iNo ; i++)
        {
            System.out.print("$\t*\t");
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }

}