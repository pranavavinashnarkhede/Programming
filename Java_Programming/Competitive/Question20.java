// write a program to find largest digit in a given number .

class Logic 
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0 , iLargest = 0 ;

        while(iNo != 0)
        {
            iDigit = iNo % 10 ;

            if(iLargest < iDigit)
            {
                iLargest = iDigit ;
            }
            iNo = iNo / 10 ;
        }

        System.out.println("Largest digit in given number is : "+iLargest);

    }
}

class Question20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findLargestDigit(856947);
    }
}