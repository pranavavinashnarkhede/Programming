
import java.util.Scanner;

class Assignment40_1
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays stars recursively.
// Input         : Integer value
// Output        : Pattern of stars
// Author        : Pranav Avinash Narkhede
// Date          : 19-07-2026
//--------------------------------------------------------------------//
    static void Display(int iValue)
    {
        if(iValue != 0)
        {
            System.out.print("*\t");
            Display(iValue-1);        
        }
    }

//--------------------------------------------------------------------//
// Application to display stars using recursion.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}