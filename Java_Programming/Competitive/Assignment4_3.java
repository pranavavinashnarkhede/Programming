/*
    3.Write a program which accept number from user and display all its non factors.
    Input : 12
    Output : 5 7 8 9 10 11
*/

import java.util.Scanner;

class Assignment4_3
{
    static void NonFact(int iNo)
    {
        if (iNo <= 0)            
        {
            iNo = -iNo ;
        }

        System.out.println("Non Factors of "+iNo +" are : ");
        for(int i = 1 ; i < iNo ; i++)
        {
            if(iNo % i != 0)
            {
                System.out.println(i +"\t");
            }
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        NonFact(iValue);

    }

}