/*
    Write a program which accept number from user and display its table.
    Input : 2
    Output : 2 4 6 8 10 12 14 16 18 20

*/


import java.util.Scanner;

class Assignment6_4
{
    static void Table(int iNo)
    {
        int i = 0 ;

        for (i = 1 ; i <= 10 ; i++)
        {
            System.out.print((iNo*i) +"\t");
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        Table(iValue);

    }

}