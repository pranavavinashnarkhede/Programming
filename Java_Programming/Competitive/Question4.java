// write a program to find maximum of two numbers .

class Logic 
{
    void findMax(int a , int b)
    {
        if(a > b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
    }
}

class Question3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(11 , 22);
    }
}