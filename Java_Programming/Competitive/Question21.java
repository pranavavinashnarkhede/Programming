// write a program to find smallest digit in a given number.

class Logic 
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0 , iSmallest = 0 ;

        iSmallest = iNo % 10 ;

        while(iNo != 0)
        {
            iDigit = iNo % 10 ;

            if(iSmallest > iDigit)
            {
                iSmallest = iDigit ;
            }
            iNo = iNo / 10 ;
        }

        System.out.println("Smallest digit in given number is : "+iSmallest);

    }
}

class Question21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findSmallestDigit(856947);
    }
}