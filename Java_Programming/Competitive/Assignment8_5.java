/*
    Write a program which accept area in square feet and convert it into square
    meter. (1 square feet = 0.0929 Square meter)

    Input : 5
    Output : 0.464515
*/


import java.util.Scanner;

class Assignment8_5
{
    static double SqurareMeter(int iValue)
    {
        return 0.0929 * iValue ;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        double dRet = 0.0 ;

        System.out.println("Enter area in square feet : ");
        iValue = sobj.nextInt();

        dRet = SqurareMeter(iValue );

        System.out.println("Area in square meter : "+dRet);

    }

}