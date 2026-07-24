/*
    Write a program which accept number from user and print even factors of that
    number.
    Input : 24
    Output: 1 2 4 6 8 12
*/


import java.util.Scanner;

class Assignment3_2
{
    static void DisplayFactors(int iNo)
    {
        if (iNo < 0)            // updator
        {
            iNo = -iNo;
        }

        for(int i = 1 ; i < iNo ; i++)
        {
            if(iNo % i == 0)
            {
                System.out.print(i + "\t");
            }
           
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        DisplayFactors(iValue);
    }

   
}