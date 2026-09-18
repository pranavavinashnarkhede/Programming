import java.util.*;

class Assignment58_5
{
//--------------------------------------------------------------------//
// Function Name : SwapRows
// Description   : Swaps every pair of consecutive rows in a matrix.
// Input         : 2D matrix
// Output        : Matrix with consecutive rows swapped
// Author        : Pranav Avinash Narkhede
// Date          : 15/09/2026
//--------------------------------------------------------------------//
    public static void SwapRows(int arr[][])
    {
        int i = 0  , j = 0 ;
        int iTemp = 0 ;

        System.out.println();
        System.out.println("Before Swapping Rows : ");
        System.out.println();

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        for(i = 0 ; i < arr.length-1 ; i = i + 2)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                iTemp = arr[i][j];
                arr[i][j] = arr[i+1][j];
                arr[i+1][j] = iTemp;
            }
        
        }
        System.out.println();
        System.out.println("After Swapping Rows : ");
        System.out.println();

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
//--------------------------------------------------------------------//
// Application to swap every pair of consecutive rows in a matrix.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ;
        int iCol = 0 ;
        int iInput = 0 ;
        int i = 0 , j = 0 ;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid input");
            return ;
        }
        
        int Matrix[][] = new int[iRow][iCol];

        System.out.println("Enter the Matrix elements : ");
        System.out.println();
        for(i = 0 ; i < iRow ; i++)
        {
            System.out.println("Enter "+(i+1)+" row element : ");
            for(j = 0 ; j < iCol ; j++)
            {
                System.out.print("Enter "+(j+1)+" column element : ");
                iInput = sobj.nextInt();

                Matrix[i][j] = iInput;
            }
            System.out.println();
        }

        SwapRows(Matrix);
    }
}