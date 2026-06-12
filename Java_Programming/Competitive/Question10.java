// write a program to find the sum of even and odd digits seperately in a number.

class Logic 
{
    void sumEvenOddDigits(int iNo)
    {
        int iSumEven = 0 , iSumOdd = 0 ;
        int iDigit = 0 ;

        while(iNo != 0)
        {
            iDigit = iNo % 10 ;

            if((iDigit % 2) == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit ;
            }

            iNo = iNo / 10 ;
        }

        System.out.println("Sum of even digits : "+iSumEven);
        System.out.println("Sum of odd digits : "+iSumOdd);
    }
}

class Question4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenOddDigits(123456);
    }
}