/*
    Write a program which accept number from user and return multiplication of all
    digits.

    Input : 2395
    Output : 270
*/


import java.util.Scanner;

class Assignment9_4
{
    static int MultDigits(int iNo)
    {
        int iMult = 1 ;
        int iDigit = 0 ;


        while(iNo != 0)
        {
            iDigit = iNo % 10 ;
            
            iMult = iMult * iDigit;
            iNo = iNo / 10 ;
        }

        return iMult;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = MultDigits(iValue);

        System.out.println("Multipication of digits are : "+iRet);

    }

}