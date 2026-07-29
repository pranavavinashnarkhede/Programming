/*
    Accept amount in US dollar and return its corresponding value in Indian currency.
    Consider 1$ as 70 rupees.

    Input : 10
    Output : 700
*/


import java.util.Scanner;

class Assignment7_2
{
    static int DollerToINR(int iNo)
    {
        return iNo * 70 ;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number of USD : ");
        iValue = sobj.nextInt();

        iRet = DollerToINR(iValue);

        System.out.println("Value in INR is : "+iRet);

    }

}