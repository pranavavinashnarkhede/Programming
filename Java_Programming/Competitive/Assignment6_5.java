/*
    5. Write a program which accept number from user and display its table in reverse
    order.
    Input : 2
    Output : 20 18 16 14 12 10 8 6 4 2

*/


import java.util.Scanner;

class Assignment6_5
{
    static void TableRev(int iNo)
    {
        int i = 0 ;

        for (i = 10 ; i >= 1 ; i--)
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

        TableRev(iValue);

    }

}