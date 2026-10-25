// write a program to print each digit of number seperately .


class Logic 
{
    void printDigits(int iNo)
    {
        int iDigit = 0 ;

        while(iNo != 0)
        {   
            iDigit = iNo % 10 ;
            System.out.println(iDigit);
            iNo = iNo / 10 ;
        }
       
    }
}

class Question15
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDigits(47963145);
    }
}