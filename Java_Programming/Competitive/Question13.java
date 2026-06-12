// write a program to display the grade of students based on marks .


class Logic 
{
    void displayGrade(int iNo)
    {
        if(iNo >= 90)
        {
            System.out.println("A");
        }
        else if(iNo >= 80)
        {
            System.out.println("B");
        }
        else if(iNo >= 70)
        {
            System.out.println("C");
        }
        else if(iNo >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }

    }
}

class Question2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayGrade(90);
    }
}