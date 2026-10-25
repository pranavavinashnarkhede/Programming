
class Assignment39_3
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays numbers from the given number to 1 recursively.
// Input         : Integer number
// Output        : Pattern of numbers
// Author        : Pranav Avinash Narkhede
// Date          : 19-07-2026
//--------------------------------------------------------------------//
    static void Display(int iNo)
    {
        if(iNo != 0)
        {
            System.out.print(iNo+"\t");
            Display(iNo-1);       
        }
    }

//--------------------------------------------------------------------//
// Application to display numbers in reverse order using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Display(5);
    }
}