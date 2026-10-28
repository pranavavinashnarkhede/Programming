// write a program to check whether the number is positive , negative , zero.

class Logic 
{
    void checkSign(int iNo)
    {
       if(iNo > 0)
       {
            System.out.println("Number is a positive .");
       }
       else if(iNo < 0)
       {
            System.out.println("Number is a negative.");
       }
       else
       {
            System.out.println("Number is zero.");
       }
        
    }
}

class Question11
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkSign(4);
    }
}