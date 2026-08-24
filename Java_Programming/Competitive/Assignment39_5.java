
class Assignment39_5
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays characters from a to f recursively.
// Input         : Character value
// Output        : Pattern of characters
// Author        : Pranav Avinash Narkhede
// Date          : 19-07-2026
//--------------------------------------------------------------------//
    static void Display(char cvalue)
    {
        if(cvalue <= 'f')
        {
            System.out.print(cvalue+"\t");
            cvalue++;
            Display(cvalue);
        }
    }

//--------------------------------------------------------------------//
// Application to display characters from a to f using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Display('a');
    }
}