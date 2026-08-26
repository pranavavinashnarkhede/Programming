
import java.util.Scanner;

class Assignment40_2
{
//--------------------------------------------------------------------//
// Function Name : Display
// Description   : Displays numbers from 1 to the given value recursively.
// Input         : Integer value
// Output        : Pattern of numbers
// Author        : Pranav Avinash Narkhede
// Date          : 21-07-2026
//--------------------------------------------------------------------//
    static void Display(int iValue)
    {
        if(iValue != 0)
        {
            Display(iValue-1);
            System.out.print(iValue+"\t");
                    
        }
    }

//--------------------------------------------------------------------//
// Application to display numbers from 1 to the given value using recursion.
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