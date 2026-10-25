/*
    Write a program which accept range from user and display all numbers in between
    that range.

    Input : 23 35
    Output : 23 24 25 26 27 28 29 30 31 32 33 34 35

    Input : 10 18
    Output : 10 11 12 13 14 15 16 17 18
*/


import java.util.Scanner;

class Assignment11_1
{
    static void RangeDisplay(int iStart , int iEnd)
    {
        int i = 0 ;

        for(i = iStart ; i <= iEnd ; i++)
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

        RangeDisplay(iValue1 ,iValue2);
    }

}