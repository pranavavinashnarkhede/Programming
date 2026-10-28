
class Assignment39_2
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays numbers from 1 to the given number recursively.
// Input         : Integer number
// Output        : Pattern of numbers
// Author        : Pranav Avinash Narkhede
// Date          : 19-07-2026
//--------------------------------------------------------------------//
    static void Display(int iNo)
    {
        if(iNo != 0)
        {
            Display(iNo-1);
            System.out.print(iNo+"\t");
                
        }
    }

//--------------------------------------------------------------------//
// Application to display numbers using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Display(5);
    }
}