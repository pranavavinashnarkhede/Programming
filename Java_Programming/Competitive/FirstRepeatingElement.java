//--------------------------------------------------------------------//
// Application to find the first repeating element in an array.
//--------------------------------------------------------------------//

import java.util.Scanner;

class FirstRepeatingElement
{
//--------------------------------------------------------------------//
// Function Name : main
// Description   : Finds the first repeating element in an array.
// Input         : Array elements
// Output        : First repeating element
// Author        : Pranav Avinash Narkhede
// Date          : 31-08-2026
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int i = 0, j = 0;

        System.out.println("Enter the size of array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(i = 0; i < Arr.length; i++)
        {
            System.out.print("Enter " + (i + 1) + " element of array : ");
            Arr[i] = sobj.nextInt();
        }

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                if(Arr[j] == Arr[i])
                {
                    System.out.println("First repeating element : " + Arr[j]);
                    return;
                }
            }
        }

        System.out.println("No repeating element found !");
    }
}