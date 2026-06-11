// write a program to find sum of digits of a number 

class Logic
{
    void SumOfDigits(int iNo)
    {
        int iSum = 0  , iDigit = 0 ;

        while(iNo != 0)
        {
            iDigit = iNo % 10 ;
            iSum = iSum + iDigit ; 
            iNo = iNo / 10 ;
        }

        System.out.println("Summation of digits : "+iSum);

    }
}


class Question1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
        
    }
}