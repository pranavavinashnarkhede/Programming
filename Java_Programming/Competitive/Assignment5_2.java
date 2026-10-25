/*
    Write a program which accept number from user and print numbers till that
    number.
    Input : 8
    Output : 1 2 3 4 5 6 7 8

*/


import java.util.Scanner;

class Assignment5_2
{
    static void Display(int iNo)
    {

        for(int i = 1 ; i <= iNo ; i++)
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