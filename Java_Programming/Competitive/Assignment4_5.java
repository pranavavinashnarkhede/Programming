/*
    5.Write a program which accept number from user and return difference between
    summation of all its factors and non factors.

    Input : 12
    Output : -34 (16 - 50)

*/


import java.util.Scanner;

class Assignment4_4
{
    static int FactDiff(int iNo)
    {
        int Sumfact = 0 ;
        int Sumnonfact = 0 ;

        for(int i = 1 ; i < iNo ; i++)
        {
            if(iNo % i != 0)
            {
                Sumnonfact = Sumnonfact + i ;
            }
            else
            {
                Sumfact = Sumfact + i ;
            }
        }

        return Sumfact - Sumnonfact   ;

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        iRet = FactDiff(iValue);

        System.out.println("Result is : "+iRet);

    }

}