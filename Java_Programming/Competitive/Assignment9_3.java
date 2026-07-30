/*
    Write a program which accept number from user and return the count of digits in
    between 3 and 7.

    Input : 2395
    Output : 1
*/


import java.util.Scanner;

class Assignment9_3
{
    static int CountRange(int iNo)
    {
        int iCount = 0 ;
        int iDigit = 0 ;


        while(iNo != 0)
        {
            iDigit = iNo % 10 ;
            if((iDigit >= 3) && (iDigit <= 7))
            {
                iCount++;
            }
            
            iNo = iNo / 10 ;
        }

        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = CountRange(iValue);

        System.out.println("Result is  : "+iRet);

    }

}