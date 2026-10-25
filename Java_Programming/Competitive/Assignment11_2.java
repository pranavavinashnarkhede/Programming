/*
    Write a program which accept range from user and display all even numbers in
    between that range.

    Input : 23 35
    Output : 24 26 28 30 32 34

    Input : 10 18
    Output : 10 12 14 16 18
*/


import java.util.Scanner;

class Assignment11_2
{
    static void RangeDisplayEven(int iStart , int iEnd)
    {
        int i = 0 ;

        for(i = iStart ; i <= iEnd ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i+"\t");
            }
            
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

        RangeDisplayEven(iValue1 ,iValue2);
    }

}