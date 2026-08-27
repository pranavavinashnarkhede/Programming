
import java.util.Scanner;

class Assignment40_4
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays characters from A to the given position recursively.
// Input         : Integer value
// Output        : Pattern of characters
// Author        : Pranav Avinash Narkhede
// Date          : 22-07-2026
//--------------------------------------------------------------------//
    static void Display(int iValue )
    {
        if(iValue != 0)
        {
            Display(iValue-1);
            System.out.print((char)('A' + iValue-1)+"\t");
            
        }
    }

//--------------------------------------------------------------------//
// Application to display characters from A using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Display(iValue );
    }
}