// write a program to find minimum of three numbers .

class Logic 
{
    void findMin(int a , int b , int c)
    {
        if((a < b) &&(a < c))
        {
            System.out.println(a+" is minimum than "+b+" and "+c);
        }
        else if(b < c)
        {
            System.out.println(b+" is minimum than "+a+" and "+c);
        }
        else
        {
            System.out.println(c+" is minimum than "+a+" and "+b);
        }
    }
}

class Question5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(11 , 22 , 14);
    }
}