
class Assignment39_1
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays the given number of stars recursively.
// Input         : Integer number
// Output        : Pattern of stars
// Author        : Pranav Avinash Narkhede
// Date          : 19-07-2026
//--------------------------------------------------------------------//
    static void Display(int iNo)
    {
        if(iNo != 0)
        {
            System.out.print("*\t");
            Display(iNo-1);
        }
    }

//--------------------------------------------------------------------//
// Application to display a pattern using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Display(5);
    }
}