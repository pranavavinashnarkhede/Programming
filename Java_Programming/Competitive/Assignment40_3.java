
import java.util.Scanner;

class Assignment40_3
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays numbers from the given value to 1 recursively.
// Input         : Integer value
// Output        : Pattern of numbers
// Author        : Pranav Avinash Narkhede
// Date          : 21-07-2026
//--------------------------------------------------------------------//
    static void Display(int iValue)
    {
        if(iValue != 0)
        {
            System.out.print(iValue+"\t");
            Display(iValue-1);
                    
        }
    }

//--------------------------------------------------------------------//
// Application to display numbers in reverse order using recursion.
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