/*
    Write a program which accept number from user and return difference between
    summation of even digits and summation of odd digits.

    Input : 2395
    Output : -15 (2 - 17)

    Input : 1018
    Output : 6 (8 - 2)
*/


import java.util.Scanner;

class Assignment9_5
{
    static int CountDiff(int iNo)
    {
        int iSumEven = 0 ;
        int iSumOdd = 0 ;
        int iDigit = 0 ;


        while(iNo != 0)
        {
            iDigit = iNo % 10 ;

            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }
            
            iNo = iNo / 10 ;
        }

        return iSumEven - iSumOdd;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = CountDiff(iValue);

        System.out.println("Difference is : "+iRet);

    }

}