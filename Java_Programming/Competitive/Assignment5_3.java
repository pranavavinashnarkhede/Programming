/*
    Write a program which accept number from user and print its numbers line.
    Input : 4
    Output : -4 -3 -2 -1 0 1 2 3 4

*/


import java.util.Scanner;

class Assignment5_3
{
    static void Display(int iNo)
    {

        for(int i = -iNo ; i <= iNo ; i++)
        {
            System.out.print(i+"\t");
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        Display(iValue);
    }

}