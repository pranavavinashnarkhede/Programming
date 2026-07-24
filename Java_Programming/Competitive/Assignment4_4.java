/*
    4.Write a program which accept number from user and return summation of all its
    non factors.
    Input : 12
    Output : 50

*/


import java.util.Scanner;

class Assignment4_4
{
    static int SumNonFact(int iNo)
    {
        int Sum = 0 ;

        for(int i = 1 ; i < iNo ; i++)
        {
            if(iNo % i != 0)
            {
                Sum = Sum + i ;
            }
        }

        return Sum ;

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        iRet = SumNonFact(iValue);

        System.out.println("Summation of Non factors is : "+iRet);

    }

}