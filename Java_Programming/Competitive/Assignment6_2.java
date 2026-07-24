/*
    Accept single digit number from user and print it into word.
    Input : 9
    Output : Nine
    Input : -3
    Output : Three
    Input : 12
    Output : Invalid Number

*/


import java.util.Scanner;

class Assignment6_2
{
    static void Display(int iNo)
    {
        if(iNo < 0)         // updator
        {
            iNo = -iNo;
        }
        if(iNo == 1)
        {
            System.out.println("One");
        }
        else if(iNo == 2)
        {
            System.out.println("Two");

        }
        else if(iNo == 3)
        {
            System.out.println("Three");
        }
        else if(iNo == 4)
        {
            System.out.println("Four");

        }
        else if(iNo == 5)
        {
            System.out.println("Five");
        }
        else if(iNo == 6)
        {
            System.out.println("Six");

        }
        else if(iNo == 7)
        {
            System.out.println("Seven");
        }
        else if(iNo == 8)
        {
            System.out.println("Eight");

        }
        else if(iNo == 9)
        {
            System.out.println("Nine");
        }
        else if(iNo == 0)
        {
            System.out.println("Zero");

        }
        else
        {
            System.out.println("Invalid Number");

        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        Display(iValue);
    }

}