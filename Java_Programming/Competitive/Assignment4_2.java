/*
    2.Write a program which accept number from user and display its factors in
    decreasing order.
    Input : 12
    Output : 6 4 3 2 1
*/

import java.util.Scanner;

class Assignment4_2
{
    static void FactRev(int iNo)
    {

        if (iNo <= 0)            
        {
            iNo = -iNo ;
        }

        System.out.println("Factors of "+iNo +" are : ");
        for(int i = iNo/2 ; i > 0  ; i--)
        {
            if(iNo % i == 0)
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

        FactRev(iValue);

    }

}