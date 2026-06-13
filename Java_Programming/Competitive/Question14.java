// write a program to check whether number is divisible by 5 and 11 or not .


class Logic 
{
    void checkDivisible(int iNo)
    {
        if(((iNo % 5) == 0) && ((iNo % 11) == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }

    }
}

class Question14
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkDivisible(55);
    }
}