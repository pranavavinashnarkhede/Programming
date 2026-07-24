/*
    Write a program which accept number from user and display its multiplication of
    factors.
    Input : 12
    Output : 144 (1 * 2 * 3 * 4 * 6)
*/


import java.util.Scanner;

class Assignment4_1
{
    static int MultFact(int iNo)
    {
        int Mult = 1 ;

        if (iNo <= 0)            
        {
            return -1 ;
        }

        for(int i = 1 ; i <= iNo/2 ; i++)
        {
            if(iNo % i == 0)
            {
                Mult = Mult * i ;
            }
        }

        return Mult;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter any number : ");
        iValue = sobj.nextInt();

        iRet = MultFact(iValue);

        if(iRet == -1)
        {
            System.out.println("Invalid Input ");
        }
        else
        {
            System.out.println("Multiplication of factors : "+iRet);

        }

    }

}