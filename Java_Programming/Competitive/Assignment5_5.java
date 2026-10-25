/*
    5. Write a program which accept N and print first 5 multiples of N.
    Input : 4
    Output : 4 8 12 16 20

*/


import java.util.Scanner;

class Assignment5_5
{
    static void MultipleDisplay(int iNo)
    {

        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.print((iNo *i)+"\t");
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        MultipleDisplay(iValue);
    }

}