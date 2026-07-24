/*
    Write a program which accept number from user and print even factors of that
    number.
    Input : 36
    Output: 2 6 12 18

*/


import java.util.Scanner;

class Assignment3_3
{
    static void DisplayEvenFactors(int iNo)
    {
        if (iNo < 0)            // updator
        {
            iNo = -iNo;
        }

        for(int i = 1 ; i < iNo ; i++)
        {
            if((iNo % i == 0) && (i % 2 == 0))
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

        DisplayEvenFactors(iValue);
    }

   
}