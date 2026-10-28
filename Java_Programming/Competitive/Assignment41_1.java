
import java.util.Scanner;

class Assignment41_1
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays numbers and stars recursively.
// Input         : Integer value
// Output        : Pattern of numbers and stars
// Author        : Pranav Avinash Narkhede
// Date          : 23-07-2026
//--------------------------------------------------------------------//
    static void Display(int iValue )
    {
        if(iValue != 0)
        {
            System.out.print(iValue+"\t*\t");
            Display(iValue-1);
            
        }
    }

//--------------------------------------------------------------------//
// Application to display a pattern of numbers and stars using recursion.
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