/*
    4. Write a program which accepts N from user and print all odd numbers up to N.
    Input : 13
    Output : 1 3 5 7 9 11 13

*/


import java.util.Scanner;

class Assignment5_4
{
    static void OddDisplay(int iNo)
    {

        for(int i = 1 ; i <= iNo ; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i+"\t");
            }
            
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        OddDisplay(iValue);
    }

}