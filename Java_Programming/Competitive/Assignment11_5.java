/*
    Write a program which accept accept range from user and display all numbers in
    between that range in reverse order.

    Input : 23 35
    Output : 35 34 33 32 31 30 29 28 27 26 25 24 23
*/


import java.util.Scanner;

class Assignment11_5
{
    static void RangeDisplayRev(int iStart , int iEnd)
    {
        int i = 0 ;

        if((iStart  > iEnd))
        {
            System.out.println("Invalid Range");
        }

        for(i = iEnd ; i >= iStart ; i--)
        {
            System.out.print(i+"\t");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 ;
        int iValue2 = 0;

        System.out.println("Enter starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = sobj.nextInt();

        RangeDisplayRev(iValue1 ,iValue2);

    }

}