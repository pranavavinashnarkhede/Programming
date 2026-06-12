// write a program to check whether a given year is leap year or not .

class Logic 
{
    void checkLeapYear(int iNo)
    {
        if((iNo % 4) == 0)
        {
            System.out.println("Year is leap .");
        }
        else
        {
            System.out.println("Year is not leap .");
        }
    }
}

class Question1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkLeapYear(2012);
    }
}