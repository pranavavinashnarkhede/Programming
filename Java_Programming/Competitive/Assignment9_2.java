/*
    Write a program which accept number from user and return the count of odd
    digits.

    Input : 2395
    Output : 3
*/


import java.util.Scanner;

class Assignment9_2
{
    static int CountOdd(int iNo)
    {
        int iCountEven = 0 ;
        int iDigit = 0 ;

        if(iNo < 0)                 // updator
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10 ;
            if(iDigit % 2 != 0)
            {
                iCountEven++;
            }
            
            iNo = iNo / 10 ;
        }

        return iCountEven;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = CountOdd(iValue);

        System.out.println("Odd digits count are : "+iRet);

    }

}