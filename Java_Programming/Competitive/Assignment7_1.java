/*
    Write a program which accept number from user and display below pattern.
    Input : 5
    Output : * * * * * # # # # #
*/


import java.util.Scanner;

class Assignment7_1
{
    static void Pattern(int iNo)
    {
        int i = 0 ;

        for (i = 1 ; i <= iNo*2 ; i++)
        {
            if(i <=iNo)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("#\t");
            }
           
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