/*
    Write a program which accept number from user and display its digits in reverse
    order.

    Input : 2395
    Output : 5
    9
    3
    2
*/


import java.util.Scanner;

class Assignment12_1
{
    static void DisplayDigit(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            System.out.println(iNo % 10);
            iNo = iNo / 10 ;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        DisplayDigit(iValue );

    }

}